package _01_basic;

import java.util.Scanner;

public class _12_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        for (int i = 0; i < 10; i++) {
            System.out.print("정수 10개 입력 : ");
            number = sc.nextInt();
            if(number % 3 == 0){
                System.out.println("3의 배수 "+ number + ", ");
            } else if(number % 2 == 0) {
                System.out.println("2의 배수 "+number + ", ");
            }


        }


















        sc.close();
    }
}
