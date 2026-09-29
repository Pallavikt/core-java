package com.xworkz.maxapp;

import com.xworkz.maxapp.cloth.Cloth;
import com.xworkz.maxapp.max.Max;

public class MaxRunner {

    public static void main(String[] args) {

        // Object creation occurs at runtime using new.
        // max is a reference variable referring to the Max object.
        Max max = new Max();

        // Creates a Cloth object.
        Cloth cloth = new Cloth();

        // Setters are used because Cloth fields are private.
        cloth.setClothId(1);
        cloth.setClothName("Slim Fit Shirt");
        cloth.setPrice(999);
        cloth.setBrand("Max");

        // Abstraction:
        // Runner calls addCloth() without knowing its internal
        // validation and array-storage implementation.
        max.addCloth(cloth);

        Cloth cloth1 = new Cloth();
        cloth1.setClothId(2);
        cloth1.setClothName("Regular Fit T-Shirt");
        cloth1.setPrice(599);
        cloth1.setBrand("Max");
        max.addCloth(cloth1);

        Cloth cloth2 = new Cloth();
        cloth2.setClothId(3);
        cloth2.setClothName("Denim Jeans");
        cloth2.setPrice(1499);
        cloth2.setBrand("Max");
        max.addCloth(cloth2);

        Cloth cloth3 = new Cloth();
        cloth3.setClothId(4);
        cloth3.setClothName("Cotton Kurta");
        cloth3.setPrice(899);
        cloth3.setBrand("Max");
        max.addCloth(cloth3);

        Cloth cloth4 = new Cloth();
        cloth4.setClothId(5);
        cloth4.setClothName("Printed Dress");
        cloth4.setPrice(1299);
        cloth4.setBrand("Max");
        max.addCloth(cloth4);

        Cloth cloth5 = new Cloth();
        cloth5.setClothId(6);
        cloth5.setClothName("Formal Trousers");
        cloth5.setPrice(1199);
        cloth5.setBrand("Max");
        max.addCloth(cloth5);

        Cloth cloth6 = new Cloth();
        cloth6.setClothId(7);
        cloth6.setClothName("Casual Shorts");
        cloth6.setPrice(699);
        cloth6.setBrand("Max");
        max.addCloth(cloth6);

        Cloth cloth7 = new Cloth();
        cloth7.setClothId(8);
        cloth7.setClothName("Denim Jacket");
        cloth7.setPrice(1799);
        cloth7.setBrand("Max");
        max.addCloth(cloth7);

        Cloth cloth8 = new Cloth();
        cloth8.setClothId(9);
        cloth8.setClothName("Floral Top");
        cloth8.setPrice(749);
        cloth8.setBrand("Max");
        max.addCloth(cloth8);

        Cloth cloth9 = new Cloth();
        cloth9.setClothId(10);
        cloth9.setClothName("Palazzo Pants");
        cloth9.setPrice(899);
        cloth9.setBrand("Max");
        max.addCloth(cloth9);

        Cloth cloth10 = new Cloth();
        cloth10.setClothId(11);
        cloth10.setClothName("Hooded Sweatshirt");
        cloth10.setPrice(1399);
        cloth10.setBrand("Max");
        max.addCloth(cloth10);

        Cloth cloth11 = new Cloth();
        cloth11.setClothId(12);
        cloth11.setClothName("Track Pants");
        cloth11.setPrice(799);
        cloth11.setBrand("Max");
        max.addCloth(cloth11);

        Cloth cloth12 = new Cloth();
        cloth12.setClothId(13);
        cloth12.setClothName("Polo T-Shirt");
        cloth12.setPrice(699);
        cloth12.setBrand("Max");
        max.addCloth(cloth12);

        Cloth cloth13 = new Cloth();
        cloth13.setClothId(14);
        cloth13.setClothName("Checked Shirt");
        cloth13.setPrice(1099);
        cloth13.setBrand("Max");
        max.addCloth(cloth13);

        Cloth cloth14 = new Cloth();
        cloth14.setClothId(15);
        cloth14.setClothName("Cargo Pants");
        cloth14.setPrice(1399);
        cloth14.setBrand("Max");
        max.addCloth(cloth14);

        Cloth cloth15 = new Cloth();
        cloth15.setClothId(16);
        cloth15.setClothName("A-Line Skirt");
        cloth15.setPrice(999);
        cloth15.setBrand("Max");
        max.addCloth(cloth15);

        Cloth cloth16 = new Cloth();
        cloth16.setClothId(17);
        cloth16.setClothName("Ethnic Kurti");
        cloth16.setPrice(799);
        cloth16.setBrand("Max");
        max.addCloth(cloth16);

        Cloth cloth17 = new Cloth();
        cloth17.setClothId(18);
        cloth17.setClothName("Leggings");
        cloth17.setPrice(499);
        cloth17.setBrand("Max");
        max.addCloth(cloth17);

        Cloth cloth18 = new Cloth();
        cloth18.setClothId(19);
        cloth18.setClothName("Chino Pants");
        cloth18.setPrice(1199);
        cloth18.setBrand("Max");
        max.addCloth(cloth18);

        Cloth cloth19 = new Cloth();
        cloth19.setClothId(20);
        cloth19.setClothName("Crop Top");
        cloth19.setPrice(649);
        cloth19.setBrand("Max");
        max.addCloth(cloth19);

        Cloth cloth20 = new Cloth();
        cloth20.setClothId(21);
        cloth20.setClothName("Jogger Pants");
        cloth20.setPrice(899);
        cloth20.setBrand("Max");
        max.addCloth(cloth20);

        Cloth cloth21 = new Cloth();
        cloth21.setClothId(22);
        cloth21.setClothName("Sweater");
        cloth21.setPrice(1299);
        cloth21.setBrand("Max");
        max.addCloth(cloth21);

        Cloth cloth22 = new Cloth();
        cloth22.setClothId(23);
        cloth22.setClothName("Night Suit");
        cloth22.setPrice(999);
        cloth22.setBrand("Max");
        max.addCloth(cloth22);

        Cloth cloth23 = new Cloth();
        cloth23.setClothId(24);
        cloth23.setClothName("Maxi Dress");
        cloth23.setPrice(1499);
        cloth23.setBrand("Max");
        max.addCloth(cloth23);

        // Calls method that traverses the array and prints all objects.
        max.getAllCloths();
    }
}