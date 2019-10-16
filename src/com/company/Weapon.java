package com.company;

public class Weapon extends Item{
    double weight;
    String description;
    double cost;
    int damageDie;
    String damageMod;

    public Weapon(double weight, String description, int damageDie, String damageMod){
        super(weight, description);
        this.damageDie = damageDie;
        this.damageMod = damageMod;
    }

    public void setWeight(double weight){this.weight = weight;}
    public double getWeight(){return weight;}

    public void setDescription(String description){this.description = description;}
    public String getDescription(){return description;}

    public void setCost(double cost){this.cost = cost;}
    public double getCost(){return cost;}

    public void setDamageDie(int damageDie){this.damageDie = damageDie;}
    public int getDamageDie(){return damageDie;}

    public void setDamageMod(String damageMod){this.damageMod = damageMod;}
    public String getDamageMod(){return damageMod;}
}
