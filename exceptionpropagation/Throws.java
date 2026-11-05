package com.xworkz.exceptionpropagation;

public class Throws {
    public static void main(String[] args)throws NullPointerException {
        System.out.println("Main Started");

        System.out.println("Main Ended");
    }
    public static void m1() throws NullPointerException{
        System.out.println("m1 started");
        m2();
        System.out.println("m1 ended");
    }
    public static void m2() throws NullPointerException{
        System.out.println("m2 started");
        m3();
        System.out.println("m2 ended");
    }
    public static void m3() throws NullPointerException{
        System.out.println("m3 started");

        String str = null;
        str.isEmpty();
        System.out.println(str);

        System.out.println("m3 ended");
    }
}
