package com.assignments;

import java.util.Scanner;

public class ArithmeticOperationsDay8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the Second number: ");
        int b = s.nextInt();
        System.out.print("Enter the first number: ");
        int c = s.nextInt();

        int [] arr = new  int[4];

        arr[0] = a + b * c;
        arr[1] = c + a / b;
        arr[2] = a % b + c;
        arr[3] = a * b + c;

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The result of a+b*c : " +arr[0]);
        System.out.println("The result of c+a/b : " +arr[0]);
        System.out.println("The result of a%b+c : "  +arr[0]);
        System.out.println("The result of a*b+c : "  +arr[0]);
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);



    }
}
