package com.xworkz.builtinexception.unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        System.out.println("Main started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter i:");
        try {
            int i = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Enter only Numbers");
        }
        System.out.println("Main Ended");
    }
}
