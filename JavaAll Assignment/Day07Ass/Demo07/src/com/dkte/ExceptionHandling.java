package com.dkte;

import java.util.Scanner;


class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong() {
        super("The String is too long");
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        try {
            int length = s.length();
            if (length > 80) {
                throw new ExceptionLineTooLong();
            }
            System.out.println("Input string is acceptable");
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }
    }
}