package com.assignments;

import java.util.Scanner;

public class LeapYear2 {
    // Main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year ");
        int year = sc.nextInt();
        System.out.println(checkYear(year)? "Leap Year" : "Not a Leap Year" );
    }
    // checkYear Method - returns boolean
    static boolean checkYear(int year)
    {
        // Return true if year is a multiple
        // of 4 and not multiple of 100.
        // OR year is multiple of 400.
        return (((year % 4 == 0) && (year % 100 != 0)) ||
                (year % 400 == 0));
    }
}
