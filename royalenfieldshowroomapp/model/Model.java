package com.xworkz.royalenfieldshowroomapp.model;

public class Model {

    private int modelId;
    private String modelName;
    private int price;
    private String color;

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Model(modelId = " + this.modelId + ", modelName = " + this.modelName +
                ", price = " + this.price + ", color = " + this.color + ")";
    }
}