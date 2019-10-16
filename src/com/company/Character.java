package com.company;

public class Character {
    int dex, str, cha, intel, con, wis;
    Inventory inventory;
    Classes charClass;
    Races race;
    int movement;

    public Character(int dex, int str, int cha, int intel, int con, int wis) {
        this.dex = dex;
        this.str = str;
        this.cha = cha;
        this.intel = intel;
        this.con = con;
        this.wis = wis;
        inventory = new Inventory();
    }

    private int getDex() {
        return this.dex;
    }

    private int getStr() {
        return this.str;
    }

    private int getCha() {
        return this.cha;
    }

    private int getIntel() {
        return this.intel;
    }

    private int getCon() {
        return this.con;
    }

    private int getWis() {
        return this.wis;
    }

    public void addItem(Item newItem) {
        inventory.addItem(newItem);
    }

    public void removeItem(Item remItem) {
        inventory.removeItem(remItem);
    }

    public int getCarryCapacity() {
        if(race.getSizeCategory() == "small") {
            return (int) Math.ceil(str * 15 / 2);
        }
        else if (race.getSizeCategory() == "Large") {
            return str * 30;
        } else {
            return str * 15;
        }
    }

    public int getMovement() {
        if (inventory.getWeight() >= getCarryCapacity() / 3) {
            return movement - 10;
        } else if (inventory.getWeight() >= getCarryCapacity() * 2 / 3) {
            return movement - 20;
        } else {
            return movement;
        }
    }

    public int getPushCarry() {
        return 2 * getCarryCapacity();
    }
}