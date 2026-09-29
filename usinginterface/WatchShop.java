package com.xworkz.abstraction.usinginterface;

public class WatchShop implements CommercialBuilding {
    @Override
    public double doBusiness(){
        System.out.println("Watch Business");
        return 80000;
    }
}
