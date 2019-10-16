package com.company;

public abstract class Item {
    double weight;
    String description;
    double cost;

    public Item(double weight, String description){
        this.weight = weight;
    }

    public void setWeight(double weight){this.weight = weight;}
    public double getWeight(){return weight;}

    public void setDescription(String description){this.description = description;}
    public String getDescription(){return description;}

    public void setCost(double cost){this.cost = cost;}
    public double getCost(){return cost;}
}
