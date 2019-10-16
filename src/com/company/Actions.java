package com.company;

public class Actions {
    String[] actions = {"Attack: 1A; With this action,you make one melee or ranged attack.",
            "Cast a Spell: You cast a spell or cantrip, casting time depends on the spell.",
            "Dash: 1A; You sacrifice you action in order to double your movement speed.",
            "Disengage: 1A; Your movement doesn't invoke attacks of opportunity for the rest of your turn.",
            "Dodge: 1A; You focus entirely on avoiding attacks. Any attack made against you until the start of your next turn has disadvantage.",
            "Help: 1A; You lend your aid to a creature's ability check giving them advantage on the check. You can also aid a friendly creature in attacking a creature within 5ft of you giving the next attack made on the target advantage up until your next turn."};

    public Actions(){}

    public int attack(){
        int damage = 0;

        return damage;
    }

    public int cast(){
        int damage = 0;

        return damage;
    }

    public String[] getAvailableActions(){return actions;}
}
