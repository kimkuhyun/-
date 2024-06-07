package _01_basic;

import java.util.Scanner;

public class _10_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int k;
        int sum =0;



        for (int i = 0; i < 10; i++) {
            System.out.print("값 입력 (총 10개): ");
            k = sc.nextInt();
            sum += k;
            }

        System.out.println(sum);

        sc.close();
















        }




















    }


