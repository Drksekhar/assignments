package com.assignments;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  year and know either it is leaf year or not ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println( year + " Leap Year");
        } else
        {
            System.out.println(year + " Not leap year");
        }
    }
}