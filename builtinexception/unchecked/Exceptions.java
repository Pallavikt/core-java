package com.xworkz.builtinexception.unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        System.out.println("Main Started");

        String str = null;
        try {
            str.isEmpty();
        }catch (NullPointerException e){
            System.out.println("String str is null");
        }

        String string = "67a";
        try {
            int s = Integer.parseInt(string);
            System.out.println(s);
        }catch (NumberFormatException e){
            System.out.println("provide only numbers");
        }

        try {
            int i = 120/0;
            System.out.println(i);
        }catch (ArithmeticException e){
            System.out.println("Can not perform divide by Zero Operation");
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter i:");
            int i = scanner.nextInt();
            System.out.println(i);
        }catch (InputMismatchException e){
            System.out.println("provide numbers only");
        }

        System.out.println("Main Ended");
    }
}

