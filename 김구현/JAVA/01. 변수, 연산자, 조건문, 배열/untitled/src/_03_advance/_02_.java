package _03_advance;

import java.util.Scanner;

public class _02_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("369게임을 위한 1~99까지의 정수 입력 : ");
        int n =sc.nextInt();
        while(n<1 ||n >99){
            System.out.print("369게임을 위한 1~99까지의 정수 입력 : ");
            n =sc.nextInt();
        }

//============================================================================================

        int num1 = n/10;
        int num2 = n%10;
        int cnt = 0;

        if( n < 10){
            if(num2 % 3 == 0 ){
                cnt++;
            }
        } else {
            if(num1 % 3 == 0 ){
                cnt++;
            }
            if(num2 % 3 == 0 ){
                cnt++;
            }
        }
        switch (cnt){
            case 0:
                System.out.print(n);
                break;
            case 1:
                System.out.print("박수짝");
                break;
            case 2:
                System.out.println("박수짝짝");
                break;
        }





    }
}
