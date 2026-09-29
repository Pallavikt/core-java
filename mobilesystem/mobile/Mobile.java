package com.xworkz.mobilesystem.mobile;

public class Mobile {

    public int mobileId;
    public String brand;
    public int price;
    public String model;
    public int storage;

    @Override
    public boolean equals(Object object) {

        Mobile mobile;
        mobile = (Mobile) object;

        if (this.mobileId == mobile.mobileId &&
                this.brand.equals(mobile.brand) &&
                this.price == mobile.price &&
                this.model.equals(mobile.model) &&
                this.storage == mobile.storage) {

            return true;
        }

        return false;
    }
}