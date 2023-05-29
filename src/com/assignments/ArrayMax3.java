package com.assignments;

public class ArrayMax3 {
    public static void main(String[] args) {
       int arr[] = new int[4];
        //int arr[] = {4,9,1,8,9};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum vale in the Array is : " + max);
        System.out.println("The maximum vale in the Array is : " + min);
    }
}
