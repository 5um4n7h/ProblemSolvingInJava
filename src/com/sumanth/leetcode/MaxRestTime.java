package com.sumanth.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class MaxRestTime {

    public static void main(String[] args) {

//        var input1 = "Mon 10:00-11:00\nMon 14:00-15:00";
//
//        System.out.println(new MaxRestTime().findMax(input1));
//        var input2 = "Mon 14:00-15:00\nMon 10:00-11:00";
//        System.out.println(new MaxRestTime().findMax(input2));
        String input3 = """
                Mon 10:00-11:00
                Wed 09:00-12:00
                Mon 04:00-05:00
                Sun 23:00-23:59
                Tue 14:00-15:00
                Thu 08:00-09:00
                """;

        System.out.println(new MaxRestTime().findMax(input3));

// Expected Sorted Order (by day and time):
// ----------------------------------------
// Mon 04:00-05:00
// Mon 10:00-11:00
// Tue 14:00-15:00
// Wed 09:00-12:00
// Sun 23:00-23:59

// After converting to total minutes from start of week:
// Mon 04:00 -> 240,     Mon 05:00 -> 300
// Mon 10:00 -> 600,     Mon 11:00 -> 660
// Tue 14:00 -> 14*60 + 1440 = 2280, Tue 15:00 -> 2340
// Wed 09:00 -> 2*1440 + 540 = 3420, Wed 12:00 -> 3600
// Sun 23:00 -> 6*1440 + 1380 = 9940,*


    }

    private Integer findMax(String timeIntervals) {
        Map<String, Integer> dayToIndex = Map.of(
                "Mon", 0,
                "Tue", 1,
                "Wed", 2,
                "Thu", 3,
                "Fri", 4,
                "Sat", 5,
                "Sun", 6
        );
        //split the input string into individual time intervals
        String[] intervals = timeIntervals.split("\n");
        var slotList = new ArrayList<Slot>();
        for (String interval : intervals) {
            //split each interval into day and time range
            String[] parts = interval.split(" ");
            String day = parts[0];
            String[] times = parts[1].split("-");
            String startTime = times[0];
            String endTime = times[1];

            //create a Slot object for each interval
            Slot slot = new Slot(day, startTime, endTime);
            slotList.add(slot);

        }
        // "HH:MM" string compares lexicographically
        slotList.sort(Comparator.comparingInt((Slot a) -> dayToIndex.get(a.day)).thenComparing(a -> a.startTime));

        var maxDiff = 0;
        for (var i = 0; i < slotList.size(); i++) {
            Slot current;
            Slot next;
            if (i == slotList.size()-1) {
                current = slotList.get(i);
                 next = slotList.getFirst();
            } else {
                //if we are not at the end, we can compare with next slot

                current = slotList.get(i);
                next = slotList.get(i + 1);
            }

            int endMinutes = convertToMinutes(current.endTime, dayToIndex.get(current.day));
            int startMinutes = convertToMinutes(next.startTime, dayToIndex.get(next.day));
            // Only adjust if we're wrapping Sunday → Monday (to calculate absolute minutes
            if (i == slotList.size() - 1 && startMinutes <= endMinutes) {
                startMinutes += 7 * 1440; // add a week’s worth of minutes to make it logically next
            }

            int diff = startMinutes - endMinutes;
            maxDiff = Math.max(maxDiff, diff);
//            System.out.printf("Gap from %s %s to %s %s = %d\n",
//                    slotList.get(i).day, slotList.get(i).endTime,
//                    slotList.get(i + 1).day, slotList.get(i + 1).startTime,
//                    diff);
        }

        return maxDiff;
    }

    private int convertToMinutes(String time, Integer dayIndex) {
        //convert in into  absolute min from start of the week
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        // Each day has 1440 minutes (24 hours * 60 minutes)
        // So, we calculate the total minutes from the start of the week
        // and add the minutes for the current day
        // dayIndex is 0 for Monday, 1 for Tuesday, ..., 6 for Sunday
        // Total minutes = (dayIndex * 1440) + (hours * 60) + minutes
        return (dayIndex * 60 * 24) + (hours * 60) + minutes;
    }

    class Slot {
        String day;
        String startTime;
        String endTime;

        Slot(String day, String startTime, String endTime) {
            this.day = day;
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
