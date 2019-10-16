package com.company;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> inventory;
    double weight;

    public Inventory(){
        inventory = new ArrayList();
    }
    public void addItem(Item newItem){
        weight += newItem.getWeight();
    }

    public void removeItem(Item remItem){
        weight -= remItem.getWeight();
    }

    public double getWeight(){
        return weight;
    }

}
