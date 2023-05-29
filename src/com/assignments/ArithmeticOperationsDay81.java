package com.assignments;

import java.util.Scanner;

public class ArithmeticOperationsDay81 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
         a = s.nextInt();
        System.out.print("Enter the Second Number: ");
        b = s.nextInt();
        System.out.print("Enter the Third  Number: ");
        c = s.nextInt();
        System.out.println("Result of Arithmetical Operations");
        System.out.println((a+b)*c);
        System.out.println((a%b)+c); // System.out.println(c+(a%b));
        System.out.println(c+(a/b));
        System.out.println((a*b)+c);



    }
}
