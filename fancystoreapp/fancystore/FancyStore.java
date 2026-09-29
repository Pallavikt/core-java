package com.xworkz.fancystoreapp.fancystore;

import com.xworkz.fancystoreapp.items.Item;

public class FancyStore {

    // Has-A relationship → FancyStore has multiple Item objects
    private Item[] items = new Item[25];

    // index keeps track of the next available array position
    int index;

    public boolean addItem(Item item) {

        boolean isAdded = false;
        boolean isItemIdValid = false;
        boolean isItemNameValid = false;
        boolean isPriceValid = false;
        boolean isBrandValid = false;

        int itemId = item.getItemId();

        if (itemId > 0) {
            isItemIdValid = true;
        } else {
            System.out.println("Item Id is Invalid");
        }

        String itemName = item.getItemName();

        if (itemName != null && !itemName.isEmpty()) {
            isItemNameValid = true;
        } else {
            System.out.println("Item Name is Invalid");
        }

        int price = item.getPrice();

        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        String brand = item.getBrand();

        if (brand != null && !brand.isEmpty()) {
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        // Object is stored only when all values are valid
        if (isItemIdValid && isItemNameValid && isPriceValid && isBrandValid) {
            items[index++] = item;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllItems() {

        for (Item item : items) {
            System.out.println(item);
        }
    }
}