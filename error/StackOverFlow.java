package com.xworkz.error;

public class StackOverFlow {
    public static void main(String[] args) {
        m1();
    }

    // A simple primitive method that calls itself endlessly
    public static void m1() {
        m1();
    }

}

