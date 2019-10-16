package com.company;

public class Armor extends Item{
    double weight;
    String description;
    double cost;
    int maxArmor;
    String armorType;

    public Armor(double weight, String description, int maxArmor, String armorType){
        super(weight, description);
        this.maxArmor= maxArmor;
        this.armorType = armorType;
    }

    public void setWeight(double weight){this.weight = weight;}
    public double getWeight(){return weight;}

    public void setDescription(String description){this.description = description;}
    public String getDescription(){return description;}

    public void setCost(double cost){this.cost = cost;}
    public double getCost(){return cost;}

    public void setMaxArmor(int maxArmor){this.maxArmor = maxArmor;}
    public int getMaxArmor(){return maxArmor;}

    public void setArmorType(String armorType){this.armorType = armorType;}
    public String getArmorType(){return armorType;}
}
