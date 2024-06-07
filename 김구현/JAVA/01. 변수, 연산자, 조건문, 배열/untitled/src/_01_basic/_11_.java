package _01_basic;

import java.util.Random;

public class _11_ {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numArray = new int[10];
        int randVal = rand.nextInt(10);

        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = rand.nextInt(10)+1;
            if(numArray[i] % 2 != 0){
                System.out.println(numArray[i]);
            }

        }






    }
}
