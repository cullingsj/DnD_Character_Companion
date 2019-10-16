package com.company;

public class Races {
    String sizeCategory;
    int dexBonus, strBonus, intelBonus, chaBonus, wisBonus, conBonus;

    public Races(String sizeCategory, int dexBonus, int strBonus, int intelBonus, int chaBonus, int wisBonus, int conBonus){
        this.dexBonus = dexBonus;
        this.strBonus = strBonus;
        this.intelBonus = intelBonus;
        this.chaBonus = chaBonus;
        this.wisBonus = wisBonus;
        this.conBonus = conBonus;
    }

    public String getSizeCategory(){return sizeCategory;}

    public int getDexBonus(){return dexBonus;}
    public int getStrBonus(){return strBonus;}
    public int getIntelBonus(){return intelBonus;}
    public int getChaBonus(){return chaBonus;}
    public int getWisBonus(){return wisBonus;}
    public int getConBonus(){return conBonus;}
}
