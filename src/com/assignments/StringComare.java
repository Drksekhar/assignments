package com.assignments;

public class StringComare {
    public static void main(String[] args) {
        String a = "Sekhar";
        String b = "Philips";
        String c = "Sekhar";
        String d = "Dayan";
        if (a == b) {
            System.out.println("False");
                    }
        else if (a == d){
            System.out.println("False");
        }
        else if (a == c){
            System.out.println("Matched two strings");
        }else {
            System.out.println("Comparator with out A");
        }
    }
}
