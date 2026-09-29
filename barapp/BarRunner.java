package com.xworkz.barapp;

import com.xworkz.barapp.alcohol.Alcohol;
import com.xworkz.barapp.bar.Bar;

public class BarRunner {

    public static void main(String[] args) {

        Bar bar = new Bar();

        Alcohol alcohol = new Alcohol();
        alcohol.setAlcoholId(1);
        alcohol.setAlcoholName("Whisky");
        alcohol.setPrice(2500);
        alcohol.setBrand("Johnnie Walker");
        bar.addAlcohol(alcohol);

        Alcohol alcohol1 = new Alcohol();
        alcohol1.setAlcoholId(2);
        alcohol1.setAlcoholName("Beer");
        alcohol1.setPrice(180);
        alcohol1.setBrand("Kingfisher");
        bar.addAlcohol(alcohol1);

        Alcohol alcohol2 = new Alcohol();
        alcohol2.setAlcoholId(3);
        alcohol2.setAlcoholName("Rum");
        alcohol2.setPrice(900);
        alcohol2.setBrand("Old Monk");
        bar.addAlcohol(alcohol2);

        Alcohol alcohol3 = new Alcohol();
        alcohol3.setAlcoholId(4);
        alcohol3.setAlcoholName("Vodka");
        alcohol3.setPrice(1400);
        alcohol3.setBrand("Absolut");
        bar.addAlcohol(alcohol3);

        Alcohol alcohol4 = new Alcohol();
        alcohol4.setAlcoholId(5);
        alcohol4.setAlcoholName("Brandy");
        alcohol4.setPrice(1100);
        alcohol4.setBrand("Mansion House");
        bar.addAlcohol(alcohol4);

        Alcohol alcohol5 = new Alcohol();
        alcohol5.setAlcoholId(6);
        alcohol5.setAlcoholName("Gin");
        alcohol5.setPrice(1800);
        alcohol5.setBrand("Bombay Sapphire");
        bar.addAlcohol(alcohol5);

        Alcohol alcohol6 = new Alcohol();
        alcohol6.setAlcoholId(7);
        alcohol6.setAlcoholName("Red Wine");
        alcohol6.setPrice(950);
        alcohol6.setBrand("Sula");
        bar.addAlcohol(alcohol6);

        Alcohol alcohol7 = new Alcohol();
        alcohol7.setAlcoholId(8);
        alcohol7.setAlcoholName("White Wine");
        alcohol7.setPrice(1050);
        alcohol7.setBrand("Fratelli");
        bar.addAlcohol(alcohol7);

        Alcohol alcohol8 = new Alcohol();
        alcohol8.setAlcoholId(9);
        alcohol8.setAlcoholName("Tequila");
        alcohol8.setPrice(2200);
        alcohol8.setBrand("Jose Cuervo");
        bar.addAlcohol(alcohol8);

        Alcohol alcohol9 = new Alcohol();
        alcohol9.setAlcoholId(10);
        alcohol9.setAlcoholName("Scotch Whisky");
        alcohol9.setPrice(3500);
        alcohol9.setBrand("Chivas Regal");
        bar.addAlcohol(alcohol9);

        Alcohol alcohol10 = new Alcohol();
        alcohol10.setAlcoholId(11);
        alcohol10.setAlcoholName("Bourbon");
        alcohol10.setPrice(2600);
        alcohol10.setBrand("Jim Beam");
        bar.addAlcohol(alcohol10);

        Alcohol alcohol11 = new Alcohol();
        alcohol11.setAlcoholId(12);
        alcohol11.setAlcoholName("Irish Whiskey");
        alcohol11.setPrice(2900);
        alcohol11.setBrand("Jameson");
        bar.addAlcohol(alcohol11);

        Alcohol alcohol12 = new Alcohol();
        alcohol12.setAlcoholId(13);
        alcohol12.setAlcoholName("Lager Beer");
        alcohol12.setPrice(220);
        alcohol12.setBrand("Budweiser");
        bar.addAlcohol(alcohol12);

        Alcohol alcohol13 = new Alcohol();
        alcohol13.setAlcoholId(14);
        alcohol13.setAlcoholName("Premium Beer");
        alcohol13.setPrice(250);
        alcohol13.setBrand("Heineken");
        bar.addAlcohol(alcohol13);

        Alcohol alcohol14 = new Alcohol();
        alcohol14.setAlcoholId(15);
        alcohol14.setAlcoholName("Sparkling Wine");
        alcohol14.setPrice(1700);
        alcohol14.setBrand("Chandon");
        bar.addAlcohol(alcohol14);

        Alcohol alcohol15 = new Alcohol();
        alcohol15.setAlcoholId(16);
        alcohol15.setAlcoholName("Cognac");
        alcohol15.setPrice(4500);
        alcohol15.setBrand("Hennessy");
        bar.addAlcohol(alcohol15);

        Alcohol alcohol16 = new Alcohol();
        alcohol16.setAlcoholId(17);
        alcohol16.setAlcoholName("Single Malt Whisky");
        alcohol16.setPrice(5200);
        alcohol16.setBrand("Glenfiddich");
        bar.addAlcohol(alcohol16);

        Alcohol alcohol17 = new Alcohol();
        alcohol17.setAlcoholId(18);
        alcohol17.setAlcoholName("Blended Whisky");
        alcohol17.setPrice(3200);
        alcohol17.setBrand("Black Dog");
        bar.addAlcohol(alcohol17);

        bar.getAllAlcohols();
    }
}