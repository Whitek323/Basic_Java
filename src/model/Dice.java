package model;

import java.util.Random;

public class Dice {

    public int[] freqs = new int[6];
    public int roll(){
        Random r = new Random();
        int dice = r.nextInt(6);
        freqs[dice] =+ 1;
        return dice+1;

    }
}
