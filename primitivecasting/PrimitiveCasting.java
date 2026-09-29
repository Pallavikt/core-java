package com.xworkz.primitivecasting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        //Explicit/Narrowing typecasting
        int i = 80;
        byte i1 = (byte) i;

        long pn = 9741182909L;
        int pn1 = (int)pn;

        System.out.println("Narrowing/Explicit typecasting....");
        System.out.println("int:"+i+"  byte:" +i1);
        System.out.println("long:"+pn+"  int:"+pn1);
        System.out.println("          ");

        //Implicit/Widening Typecasting
        int o = 10;
        long o1 = (long) o;

        byte b = 21;
        long l = (long)b;

        byte b1 = 2;
        double d = (double)b1;

        System.out.println("Widening/Implicit typecasting....");
        System.out.println("int:"+o+"  long:"+o1);
        System.out.println("byte:"+b+"  long:"+l);
        System.out.println("byte:"+b1+"  double:"+d);
    }
}
