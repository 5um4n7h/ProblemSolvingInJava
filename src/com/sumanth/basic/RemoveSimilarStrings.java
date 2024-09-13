package com.sumanth.basic;

import java.util.*;

public class RemoveSimilarStrings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("MRP_1");
        strings.add("MRP_2");
        strings.add("MRP_1 A");
        strings.add("MRP_1 B");
        strings.add("MRP");
        strings.add("LDP_1");
        strings.add("LDP");
        strings.add("ABC");
        strings.add("ABC_1");
        strings.add("ABC_2");
        strings.add("XYZ_1");
        strings.add("XYZ_2");

        
        //Set<String> result = new HashSet<>();
        
//        for (String s : strings) {
//           result.add(getBaseForm(s));
//        }
        var result = removeSimilarStrings(strings);
        System.out.printf(result.toString());
    }
    
    public static List<String> removeSimilarStrings(List<String> allConfigDomains) {
        // Sort the list of strings by length to ensure shortest strings come first
        Collections.sort(allConfigDomains, (a, b) -> Integer.compare(a.length(), b.length()));
        
        allConfigDomains.sort(Comparator.comparingInt(String::length));
        var uniqueConfigDomains = new ArrayList<String>();
        for (var item : allConfigDomains) {
            var isUnique = true;
            for (var item2 : uniqueConfigDomains) {
                if (item.startsWith(item2)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueConfigDomains.add(item);
            }
        }
        
        return uniqueConfigDomains;
    }
    
    private static String getBaseForm(String s) {
        int index = s.indexOf('_');
        return (index != -1) ? s.substring(0, index) : s;
    }
}
