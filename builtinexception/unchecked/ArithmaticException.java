package com.xworkz.builtinexception.unchecked;

public class ArithmaticException {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            int i = 12/0;
            System.out.println(i);
        }catch (ArithmeticException e){
            System.out.println("Divide by Zero is Not Possible");
        }
        System.out.println("Main Ended");
    }
}
