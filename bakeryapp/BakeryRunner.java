package com.xworkz.bakeryapp;

import com.xworkz.bakeryapp.bakery.Bakery;
import com.xworkz.bakeryapp.condiment.Condiment;

public class BakeryRunner {

    public static void main(String[] args) {

        Bakery bakery = new Bakery();

        Condiment condiment = new Condiment();
        condiment.setCondimentId(1);
        condiment.setCondimentName("Chocolate Syrup");
        condiment.setPrice(180);
        condiment.setBrand("Hershey's");
        bakery.addCondiment(condiment);

        Condiment condiment1 = new Condiment();
        condiment1.setCondimentId(2);
        condiment1.setCondimentName("Strawberry Syrup");
        condiment1.setPrice(160);
        condiment1.setBrand("Mapro");
        bakery.addCondiment(condiment1);

        Condiment condiment2 = new Condiment();
        condiment2.setCondimentId(3);
        condiment2.setCondimentName("Caramel Sauce");
        condiment2.setPrice(220);
        condiment2.setBrand("Veeba");
        bakery.addCondiment(condiment2);

        Condiment condiment3 = new Condiment();
        condiment3.setCondimentId(4);
        condiment3.setCondimentName("Peanut Butter");
        condiment3.setPrice(250);
        condiment3.setBrand("Pintola");
        bakery.addCondiment(condiment3);

        Condiment condiment4 = new Condiment();
        condiment4.setCondimentId(5);
        condiment4.setCondimentName("Fruit Jam");
        condiment4.setPrice(140);
        condiment4.setBrand("Kissan");
        bakery.addCondiment(condiment4);

        Condiment condiment5 = new Condiment();
        condiment5.setCondimentId(6);
        condiment5.setCondimentName("Honey");
        condiment5.setPrice(210);
        condiment5.setBrand("Dabur");
        bakery.addCondiment(condiment5);

        Condiment condiment6 = new Condiment();
        condiment6.setCondimentId(7);
        condiment6.setCondimentName("Mayonnaise");
        condiment6.setPrice(190);
        condiment6.setBrand("Hellmann's");
        bakery.addCondiment(condiment6);

        Condiment condiment7 = new Condiment();
        condiment7.setCondimentId(8);
        condiment7.setCondimentName("Cheese Spread");
        condiment7.setPrice(230);
        condiment7.setBrand("Amul");
        bakery.addCondiment(condiment7);

        Condiment condiment8 = new Condiment();
        condiment8.setCondimentId(9);
        condiment8.setCondimentName("Hazelnut Spread");
        condiment8.setPrice(380);
        condiment8.setBrand("Nutella");
        bakery.addCondiment(condiment8);

        Condiment condiment9 = new Condiment();
        condiment9.setCondimentId(10);
        condiment9.setCondimentName("Whipped Cream");
        condiment9.setPrice(275);
        condiment9.setBrand("Rich's");
        bakery.addCondiment(condiment9);

        Condiment condiment10 = new Condiment();
        condiment10.setCondimentId(11);
        condiment10.setCondimentName("Blueberry Filling");
        condiment10.setPrice(320);
        condiment10.setBrand("Mala's");
        bakery.addCondiment(condiment10);

        Condiment condiment11 = new Condiment();
        condiment11.setCondimentId(12);
        condiment11.setCondimentName("Vanilla Essence");
        condiment11.setPrice(95);
        condiment11.setBrand("Weikfield");
        bakery.addCondiment(condiment11);

        Condiment condiment12 = new Condiment();
        condiment12.setCondimentId(13);
        condiment12.setCondimentName("Chocolate Chips");
        condiment12.setPrice(240);
        condiment12.setBrand("Morde");
        bakery.addCondiment(condiment12);

        Condiment condiment13 = new Condiment();
        condiment13.setCondimentId(14);
        condiment13.setCondimentName("Sprinkles");
        condiment13.setPrice(120);
        condiment13.setBrand("Urban Platter");
        bakery.addCondiment(condiment13);

        Condiment condiment14 = new Condiment();
        condiment14.setCondimentId(15);
        condiment14.setCondimentName("Butterscotch Sauce");
        condiment14.setPrice(195);
        condiment14.setBrand("Mapro");
        bakery.addCondiment(condiment14);

        Condiment condiment15 = new Condiment();
        condiment15.setCondimentId(16);
        condiment15.setCondimentName("Mango Topping");
        condiment15.setPrice(170);
        condiment15.setBrand("Mala's");
        bakery.addCondiment(condiment15);

        Condiment condiment16 = new Condiment();
        condiment16.setCondimentId(17);
        condiment16.setCondimentName("Cream Cheese");
        condiment16.setPrice(350);
        condiment16.setBrand("D'lecta");
        bakery.addCondiment(condiment16);

        bakery.getAllCondiments();
    }
}