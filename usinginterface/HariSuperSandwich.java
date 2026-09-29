package com.xworkz.abstraction.usinginterface;

public class HariSuperSandwich implements CommercialBuilding {

    @Override
    public double doBusiness() {
        System.out.println("Sandwitch and Chat Business");
        return 100000.00;
    }
}
