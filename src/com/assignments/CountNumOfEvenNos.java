package com.assignments;

public class CountNumOfEvenNos {
    static  int count;
    public static void main(String[] args) {
       // int count;
        int sumeven = 0;
        int x;
        for (  x = 0; x <=10 ; x++) {
            if (x % 2 == 0) {
              System.out.println("List the even numbers from one to 10 : " +x);
              count = count+1;
                sumeven += x;
            }

        }
        System.out.println("Total num of Even Numbers are : " +count);
        System.out.println("Sum of Even Numbers is: " + sumeven);
    }
}
