package _03_advance;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요 : ");
        int number = sc.nextInt();


        System.out.print("오만원 " + number/50000 + "매, ");
        number = number%50000;
        System.out.print("만원" + number/10000 + "매, ");
        number = number%10000;
        System.out.print("오천원" + number/5000 + "매, ");
        number = number%5000;
        System.out.print("천원" + number/1000 + "매, ");
        number = number%1000;
        System.out.print("오백원" + number/500 + "매, ");
        number = number%500;
        System.out.print("백원" + number/100 + "매, ");
        number = number%100;
        System.out.print("오십원" + number/50 + "매, ");
        number = number%50;
        System.out.print("십원" + number/10 + "매, ");
        number = number%10;









        sc.close();



    }
}
