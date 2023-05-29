package com.assignments;

public class ArrayEvenCountSum {
    public static void main(String[] args) {
        int [] arrayeven =  {1,2,3,4,5,6};
        int x;
        int count = 0;
        int sum = 0;
        // int [] num =  {1,2,3,4,5,6};
        for ( x = 0; x <= arrayeven.length-1 ; x++) {
            if (arrayeven [x] % 2 == 0) {
                System.out.println( "Print  Even Numbers : " + arrayeven[x]);
                count = count+1;
                sum = sum+arrayeven[x];

            }

        }
        System.out.println( "No of Even Numbers : " + count);
        System.out.println( "Sum of Even Numbers : " + sum);

    }
}
