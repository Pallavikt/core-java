package com.xworkz.builtinexception.unchecked;

public class NumberFormat {
    public static void main(String[] args) {
        System.out.println("Main Started");
        String s = "27a";
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println("use only string containing numbers");
        }
        System.out.println("Main Ended");
    }
}
