package com.xworkz.error;

public class OutOfMemory {
        public static void main(String[] args) {
            System.out.println("OutOfMemoryError Example");
            int[] i = new int[10000*100000];
            System.out.println(i);
        }
}

