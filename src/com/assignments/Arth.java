package com.assignments;

import java.util.Scanner;

public class Arth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();

        // Perform arithmetic operations and store the results in an array
        double[] results = new double[4];
        results[0] = a + b * c;
        results[1] = c + a / b;
        results[2] = a % b + c;
        results[3] = a * b + c;

        // Find maximum and minimum values
        double max = results[0];
        double min = results[0];

        for (int i = 1; i < results.length; i++) {
            if (results[i] > max) {
                max = results[i];
            }

            if (results[i] < min) {
                min = results[i];
            }
        }

        // Print the results
        System.out.println("Results:");
        System.out.println("a + b * c = " + results[0]);
        System.out.println("c + a / b = " + results[1]);
        System.out.println("a % b + c = " + results[2]);
        System.out.println("a * b + c = " + results[3]);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
