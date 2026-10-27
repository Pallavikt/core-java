package com.xworkz.stationary;

import com.xworkz.stationary.item.Item;

public interface Stationary {

    boolean addItem(Item item);
    void getAllItems();
    Item getItemById(int id);
    boolean updatePriceById(int newPrice,int id);
}
