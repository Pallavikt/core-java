package com.xworkz.fancystoreapp;

import com.xworkz.fancystoreapp.fancystore.FancyStore;
import com.xworkz.fancystoreapp.items.Item;

public class FancyStoreRunner {

    public static void main(String[] args) {

        FancyStore fancyStore = new FancyStore();

        Item item = new Item();
        item.setItemId(1);
        item.setItemName("Hair Band");
        item.setPrice(120);
        item.setBrand("Yellow Chimes");
        fancyStore.addItem(item);

        Item item1 = new Item();
        item1.setItemId(2);
        item1.setItemName("Hair Clip");
        item1.setPrice(150);
        item1.setBrand("YouBella");
        fancyStore.addItem(item1);

        Item item2 = new Item();
        item2.setItemId(3);
        item2.setItemName("Bracelet");
        item2.setPrice(350);
        item2.setBrand("Zaveri Pearls");
        fancyStore.addItem(item2);

        Item item3 = new Item();
        item3.setItemId(4);
        item3.setItemName("Necklace");
        item3.setPrice(899);
        item3.setBrand("Shining Diva");
        fancyStore.addItem(item3);

        Item item4 = new Item();
        item4.setItemId(5);
        item4.setItemName("Earrings");
        item4.setPrice(450);
        item4.setBrand("Sukkhi");
        fancyStore.addItem(item4);

        Item item5 = new Item();
        item5.setItemId(6);
        item5.setItemName("Handbag");
        item5.setPrice(1299);
        item5.setBrand("Lavie");
        fancyStore.addItem(item5);

        Item item6 = new Item();
        item6.setItemId(7);
        item6.setItemName("Wallet");
        item6.setPrice(799);
        item6.setBrand("Baggit");
        fancyStore.addItem(item6);

        Item item7 = new Item();
        item7.setItemId(8);
        item7.setItemName("Sunglasses");
        item7.setPrice(1499);
        item7.setBrand("Fastrack");
        fancyStore.addItem(item7);

        Item item8 = new Item();
        item8.setItemId(9);
        item8.setItemName("Ring");
        item8.setPrice(599);
        item8.setBrand("Giva");
        fancyStore.addItem(item8);

        Item item9 = new Item();
        item9.setItemId(10);
        item9.setItemName("Anklet");
        item9.setPrice(399);
        item9.setBrand("Priyaasi");
        fancyStore.addItem(item9);

        Item item10 = new Item();
        item10.setItemId(11);
        item10.setItemName("Scrunchie");
        item10.setPrice(99);
        item10.setBrand("Hair Drama");
        fancyStore.addItem(item10);

        Item item11 = new Item();
        item11.setItemId(12);
        item11.setItemName("Makeup Pouch");
        item11.setPrice(299);
        item11.setBrand("Miniso");
        fancyStore.addItem(item11);

        Item item12 = new Item();
        item12.setItemId(13);
        item12.setItemName("Keychain");
        item12.setPrice(149);
        item12.setBrand("Chumbak");
        fancyStore.addItem(item12);

        Item item13 = new Item();
        item13.setItemId(14);
        item13.setItemName("Pendant");
        item13.setPrice(699);
        item13.setBrand("Giva");
        fancyStore.addItem(item13);

        Item item14 = new Item();
        item14.setItemId(15);
        item14.setItemName("Bangle");
        item14.setPrice(499);
        item14.setBrand("Sukkhi");
        fancyStore.addItem(item14);

        Item item15 = new Item();
        item15.setItemId(16);
        item15.setItemName("Brooch");
        item15.setPrice(349);
        item15.setBrand("Yellow Chimes");
        fancyStore.addItem(item15);

        Item item16 = new Item();
        item16.setItemId(17);
        item16.setItemName("Clutch");
        item16.setPrice(999);
        item16.setBrand("Caprese");
        fancyStore.addItem(item16);

        Item item17 = new Item();
        item17.setItemId(18);
        item17.setItemName("Hair Extension");
        item17.setPrice(749);
        item17.setBrand("Nish Hair");
        fancyStore.addItem(item17);

        Item item18 = new Item();
        item18.setItemId(19);
        item18.setItemName("Tiara");
        item18.setPrice(599);
        item18.setBrand("YouBella");
        fancyStore.addItem(item18);

        Item item19 = new Item();
        item19.setItemId(20);
        item19.setItemName("Nose Pin");
        item19.setPrice(299);
        item19.setBrand("Giva");
        fancyStore.addItem(item19);

        Item item20 = new Item();
        item20.setItemId(21);
        item20.setItemName("Toe Ring");
        item20.setPrice(249);
        item20.setBrand("Priyaasi");
        fancyStore.addItem(item20);

        Item item21 = new Item();
        item21.setItemId(22);
        item21.setItemName("Charm Bracelet");
        item21.setPrice(899);
        item21.setBrand("Shining Diva");
        fancyStore.addItem(item21);

        Item item22 = new Item();
        item22.setItemId(23);
        item22.setItemName("Hair Clutcher");
        item22.setPrice(199);
        item22.setBrand("Miniso");
        fancyStore.addItem(item22);

        Item item23 = new Item();
        item23.setItemId(24);
        item23.setItemName("Vanity Box");
        item23.setPrice(1199);
        item23.setBrand("Nykaa");
        fancyStore.addItem(item23);

        Item item24 = new Item();
        item24.setItemId(25);
        item24.setItemName("Jewellery Box");
        item24.setPrice(1599);
        item24.setBrand("Chumbak");
        fancyStore.addItem(item24);

        // Displays all 25 Item objects stored in FancyStore
        fancyStore.getAllItems();
    }
}