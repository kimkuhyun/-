package _02_middle;

import java.util.Random;

public class _04_ {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
        }


        for(int j = 0; j < arr.length; j++) {
            if (j % 2 == 1) {
                System.out.println("index: " + j);
                System.out.print(arr[j] + ", ");
             } else {
                System.out.println("index: " + (arr.length - 2 - j));
                System.out.print(arr[arr.length - 2 - j] + ", ");

            }
        }


















/*

        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;

            for(int j = 0; j < arr.length; j++) {
                if(j% 2 == 1) {
                    System.out.print(arr[j] + " ");
                } else {
                    System.out.print(arr[arr.length- 2 - j]  + " ");
                }
            }




            /*
            if(arr[i] % 3 == 0) {
                System.out.print(arr[i] + 1 + ", ");
            }
            for(int j = 20; j < arr.length; j++) {
                arr[i] = rand.nextInt(100) + 1;
                if(arr[i] % 2 == 0) {
                    System.out.print(arr[i] + 1 + ",, ");
                }
                */




    }

}





















