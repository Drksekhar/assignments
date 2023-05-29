package com.assignments;

public class ArrayMax2 {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6,7,8};
        int max = ar[0];
        int min = ar[0];
        for (int i = 0; i <= ar.length-1 ; i++) {
            if ((ar [i] > max) || (ar [i] < min)){
                max = ar[i];
                min = ar[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Maximum value in the array: " + min);
    }
}
