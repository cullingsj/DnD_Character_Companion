package com.company;
import java.util.Random;

public class DiceRoller {
    Random roller = new Random();

    public DiceRoller(){
    }

    public int rollStat(){
        int statResult = 0;
        int[] temp = new int[4];

        for(int i = 0; i<5; i++){
            int currRoll = roller.nextInt(3) + 1;

        }

        return statResult;
    }

    public int roll(int die, int num){
        int rollResult = 0;
        for(int i = 0; i<num; i++){
            rollResult += roller.nextInt(die - 1) + 1;
        }
        return rollResult;
    }

    public int roll(int die, int num, int mod){
        int rollResult = 0;
        for(int i = 0; i<num; i++){
            rollResult += roller.nextInt(die - 1) + 1;
        }
        rollResult += mod;
        return rollResult;
    }
}
