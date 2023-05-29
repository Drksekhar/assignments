package com.assignments;

public class ArrayEvenCountSum2 {
    public static void main(String[] args) {
        int x;
        int c = 0;
        int s = 0;
        int [] ar = {1,2,3,4,5,6,7,8};
        for ( x = 0; x <= ar.length-1 ; x++) {
            if (ar[x] % 2  == 0) {
                System.out.println("Print the even numbers: "+ ar[x]);
                c += 1;
                s += ar[x];


            }
        }
        System.out.println("No of even numbers: "+ c);
        System.out.println("Sum of even numbers: "+ s);
    }
}
