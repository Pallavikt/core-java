package com.xworkz.builtinexception.unchecked;

public class NullPointer {

    public static void main(String[] args) {

        System.out.println("Main Started");
        String str = null;
        try {
            str.equals("");
            System.out.println(str);
        }catch (NullPointerException e){
            System.out.println("str is null");
        }
        System.out.println("Main Ended");
    }
}
