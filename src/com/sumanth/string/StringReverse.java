package com.sumanth.string;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello World";

        //inbuilt method
        var reversedString = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversedString);

        //converting it into array

        char[] charArray = str.toCharArray();
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedStringBuilder.append(charArray[i]);
        }

        String reversedStringUsingArray = reversedStringBuilder.toString();
        System.out.println("Reversed String using array: " + reversedStringUsingArray);


        //using two pointers
        String str1 = "Hello World";
        char[] charArray1 = str1.toCharArray();
        int left = 0;
        int right = charArray1.length - 1;
        while (left < right) {
            char temp = charArray1[left];
            charArray1[left] = charArray1[right];
            charArray1[right] = temp;
            left++;
            right--;
        }

        String reversedStringUsingTwoPointers = new String(charArray1);
        System.out.println("Reversed String using two pointers: " + reversedStringUsingTwoPointers);

    }
}
