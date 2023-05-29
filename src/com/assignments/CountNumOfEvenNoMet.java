package com.assignments;

public class CountNumOfEvenNoMet {
    public static void countAndSumEven(){
        int x;
        int count =0;
        int sum =0;
        for ( x = 0; x <=10 ; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
                count = count+1;
                sum = sum+x;

            }

        }
        System.out.println(count);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        countAndSumEven();
    }
}
