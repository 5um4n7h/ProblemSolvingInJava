package com.sumanth.array;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TwoDArray {


    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        String simulatedInput = "1 2 3 4 5 6 7 8 9";

// Creating an InputStream from the simulated input string
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner sc = new Scanner(inputStream);
        System.out.println("Enter array elements by row  for 3*3 array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        TwoDArray twoDArray = new TwoDArray();
        twoDArray.printArray(arr);


        System.out.println("swapping non diagonal");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j < i){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        twoDArray.printArray(arr);

    }

    void printArray(int[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
