package com.xworkz.abstraction.usinginterface;

public class BuildingRunner {
    public static void main(String[] args) {

        //Abstraction
        CommercialBuilding commercialBuilding = new HariSuperSandwich();
        commercialBuilding.doBusiness();

        CommercialBuilding commercialBuilding1 = new WatchShop();
        commercialBuilding1.doBusiness();
    }
}
