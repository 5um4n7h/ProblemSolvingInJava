package com.sumanth.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class MaxRestTime {

    public static void main(String[] args) {

        var input1 = "Mon 10:00-11:00\nMon 14:00-15:00";

        System.out.println(new MaxRestTime().findMax(input1));
        var input2 = "Mon 14:00-15:00\nMon 10:00-11:00";
        System.out.println(new MaxRestTime().findMax(input2));


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
        for(String interval : intervals) {
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
        for(Slot slot : slotList) {
            //convert start and end times to minutes for easier comparison
            int startMinutes = convertToMinutes(slot.startTime);
            int endMinutes = convertToMinutes(slot.endTime);

            //calculate the difference in minutes
            int diff = endMinutes - startMinutes;

            //update maxDiff if the current difference is greater
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        return maxDiff;
    }

    private int convertToMinutes(String time) {

        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes; // convert to total minutes
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
