package com.assignments;

public class CountNumOfEvenNos2 {
    public static void main(String[] args) {
        // for initializing
        int x;
        // for counting . Note we should declare variable and assign 0
        int count = 0;
        // to know the sum of even numbers . Note we should declare variable and assign 0
        int sum= 0;
        // code to find the no of even numbers
        for ( x = 0; x <=10 ; x++) {
            if (x % 2 == 0) {
                System.out.println("List the no of even numbers 1 to 10: " + x);
                count = count+1;
                sum = sum+x;

            }

        }
        System.out.println("counting the no of even numbers: " + count);
        System.out.println("The sum of even numbers: " + sum);
            }


}
