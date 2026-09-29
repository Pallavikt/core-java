package com.xworkz.royalenfieldshowroomapp.royalenfieldshowroom;

import com.xworkz.royalenfieldshowroomapp.model.Model;

public class RoyalEnfieldShowroom {

    private Model[] models = new Model[23];
    int index;

    public boolean addModel(Model model) {

        boolean isAdded = false;
        boolean isModelIdValid = false;
        boolean isModelNameValid = false;
        boolean isPriceValid = false;
        boolean isColorValid = false;

        int modelId = model.getModelId();

        if (modelId > 0) {
            isModelIdValid = true;
        } else {
            System.out.println("Model Id is Invalid");
        }

        String modelName = model.getModelName();

        if (modelName != null && !modelName.isEmpty()) {
            isModelNameValid = true;
        } else {
            System.out.println("Model Name is Invalid");
        }

        int price = model.getPrice();

        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        String color = model.getColor();

        if (color != null && !color.isEmpty()) {
            isColorValid = true;
        } else {
            System.out.println("Color is Invalid");
        }

        if (isModelIdValid && isModelNameValid && isPriceValid && isColorValid) {

            models[index++] = model;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllModels() {

        for (Model model : models) {
            System.out.println(model);
        }
    }
}