package com.assignments;

public class ArrayMax {
    public static void main(String[] args) {
        int [] num = {1,2,12,4,5,6,7,8};
        int max = num[0];
        int min  = num[0];
        for (int i = 0; i <= num.length-1 ; i++) {
           // if ((num[i] > max) && (num[i] < min)) {
            // How to get both min and max Element by using one if condition but by using  || or &&
            if (num[i] > max) {
                max = num[i];
             }
            if (num[i] < min) {
                min = num[i];
            }
            }
        System.out.println(max);
        System.out.println(min);

        }
    }
