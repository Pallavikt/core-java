package com.xworkz.stationary.impl;

import com.xworkz.stationary.Stationary;
import com.xworkz.stationary.item.Item;

public class StationaryImpl implements Stationary {

    private Item[] items;
    private int index;

    public StationaryImpl(int size){
        this.items = new Item[size];
    }

    @Override
    public boolean addItem(Item item) {
        boolean isAdded = false;
        boolean isIdValid = false;
        boolean isItemNameValid = false;
        boolean isPriceValid = false;
        boolean isMfgDateValid = false;
        boolean isExpDateVallid = false;

        int id = item.id;
        if(id > 0){
            isIdValid = true;
        }else System.out.println("Id is not Valid!");

        String itemName = item.itemName;
        if(itemName != null && !itemName.isEmpty()){
            isItemNameValid = true;
        }else System.out.println("Item Name is not Valid!");

        int price = item.price;
        if (price>0){
            isPriceValid = true;
        }else System.out.println("Price is not Valid!");

        String mfgDate = item.mfgDate;
        if (mfgDate != null && !mfgDate.isEmpty()){
            isMfgDateValid = true;
        }else System.out.println("Manufacturing Date is invalid!");

        String expDate = item.expiryDate;
        if (expDate != null && !expDate.isEmpty()){
            isExpDateVallid = true;
        }else System.out.println("Expiry Date is not Valid!");

        if (isIdValid&&isItemNameValid&&isPriceValid&&isMfgDateValid&&isExpDateVallid){
           if (index < items.length){
               items[index++] = item;
               isAdded = true;
           }
        }

        return isAdded;
    }

    @Override
    public void getAllItems() {
        for (Item item: items){
            if(item != null){
                System.out.println(item);
            }
        }
    }

    @Override
    public Item getItemById(int id) {
        Item item = null;
        for (Item item1: items){
            if (id == item1.id){
              item = item1;
            }
        }
        return item;
    }

    @Override
    public boolean updatePriceById(int newPrice, int id) {
        boolean isUpdated = false;
        for (Item item : items){
            if (id == item.id){
                item.setPrice(newPrice);
                isUpdated = true;
            }
        }
        return isUpdated;
    }
}
