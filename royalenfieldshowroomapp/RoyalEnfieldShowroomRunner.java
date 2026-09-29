package com.xworkz.royalenfieldshowroomapp;

import com.xworkz.royalenfieldshowroomapp.model.Model;
import com.xworkz.royalenfieldshowroomapp.royalenfieldshowroom.RoyalEnfieldShowroom;

public class RoyalEnfieldShowroomRunner {

    public static void main(String[] args) {

        RoyalEnfieldShowroom showroom = new RoyalEnfieldShowroom();

        Model model = new Model();
        model.setModelId(1);
        model.setModelName("Classic 350");
        model.setPrice(193000);
        model.setColor("Stealth Black");
        showroom.addModel(model);

        Model model1 = new Model();
        model1.setModelId(2);
        model1.setModelName("Bullet 350");
        model1.setPrice(174000);
        model1.setColor("Standard Black");
        showroom.addModel(model1);

        Model model2 = new Model();
        model2.setModelId(3);
        model2.setModelName("Hunter 350");
        model2.setPrice(150000);
        model2.setColor("Rebel Blue");
        showroom.addModel(model2);

        Model model3 = new Model();
        model3.setModelId(4);
        model3.setModelName("Meteor 350");
        model3.setPrice(206000);
        model3.setColor("Fireball Red");
        showroom.addModel(model3);

        Model model4 = new Model();
        model4.setModelId(5);
        model4.setModelName("Himalayan 450");
        model4.setPrice(285000);
        model4.setColor("Kaza Brown");
        showroom.addModel(model4);

        Model model5 = new Model();
        model5.setModelId(6);
        model5.setModelName("Guerrilla 450");
        model5.setPrice(239000);
        model5.setColor("Brava Blue");
        showroom.addModel(model5);

        Model model6 = new Model();
        model6.setModelId(7);
        model6.setModelName("Interceptor 650");
        model6.setPrice(303000);
        model6.setColor("Canyon Red");
        showroom.addModel(model6);

        Model model7 = new Model();
        model7.setModelId(8);
        model7.setModelName("Continental GT 650");
        model7.setPrice(319000);
        model7.setColor("Rocker Red");
        showroom.addModel(model7);

        Model model8 = new Model();
        model8.setModelId(9);
        model8.setModelName("Super Meteor 650");
        model8.setPrice(364000);
        model8.setColor("Astral Black");
        showroom.addModel(model8);

        Model model9 = new Model();
        model9.setModelId(10);
        model9.setModelName("Shotgun 650");
        model9.setPrice(359000);
        model9.setColor("Sheetmetal Grey");
        showroom.addModel(model9);

        Model model10 = new Model();
        model10.setModelId(11);
        model10.setModelName("Bear 650");
        model10.setPrice(339000);
        model10.setColor("Broadwalk White");
        showroom.addModel(model10);

        Model model11 = new Model();
        model11.setModelId(12);
        model11.setModelName("Classic 350 Signals");
        model11.setPrice(216000);
        model11.setColor("Marsh Grey");
        showroom.addModel(model11);

        Model model12 = new Model();
        model12.setModelId(13);
        model12.setModelName("Classic 350 Chrome");
        model12.setPrice(225000);
        model12.setColor("Emerald");
        showroom.addModel(model12);

        Model model13 = new Model();
        model13.setModelId(14);
        model13.setModelName("Hunter 350 Metro");
        model13.setPrice(170000);
        model13.setColor("Dapper Grey");
        showroom.addModel(model13);

        Model model14 = new Model();
        model14.setModelId(15);
        model14.setModelName("Hunter 350 Retro");
        model14.setPrice(150000);
        model14.setColor("Factory Black");
        showroom.addModel(model14);

        Model model15 = new Model();
        model15.setModelId(16);
        model15.setModelName("Meteor 350 Stellar");
        model15.setPrice(216000);
        model15.setColor("Stellar Blue");
        showroom.addModel(model15);

        Model model16 = new Model();
        model16.setModelId(17);
        model16.setModelName("Meteor 350 Supernova");
        model16.setPrice(230000);
        model16.setColor("Supernova Red");
        showroom.addModel(model16);

        Model model17 = new Model();
        model17.setModelId(18);
        model17.setModelName("Himalayan Adventure");
        model17.setPrice(298000);
        model17.setColor("Slate Himalayan Salt");
        showroom.addModel(model17);

        Model model18 = new Model();
        model18.setModelId(19);
        model18.setModelName("Interceptor 650 Custom");
        model18.setPrice(311000);
        model18.setColor("Black Ray");
        showroom.addModel(model18);

        Model model19 = new Model();
        model19.setModelId(20);
        model19.setModelName("Continental GT 650 Chrome");
        model19.setPrice(345000);
        model19.setColor("Mr Clean");
        showroom.addModel(model19);

        Model model20 = new Model();
        model20.setModelId(21);
        model20.setModelName("Super Meteor 650 Tourer");
        model20.setPrice(394000);
        model20.setColor("Celestial Blue");
        showroom.addModel(model20);

        Model model21 = new Model();
        model21.setModelId(22);
        model21.setModelName("Shotgun 650 Custom");
        model21.setPrice(373000);
        model21.setColor("Plasma Blue");
        showroom.addModel(model21);

        Model model22 = new Model();
        model22.setModelId(23);
        model22.setModelName("Bullet 350 Military");
        model22.setPrice(174000);
        model22.setColor("Military Red");
        showroom.addModel(model22);

        showroom.getAllModels();
    }
}