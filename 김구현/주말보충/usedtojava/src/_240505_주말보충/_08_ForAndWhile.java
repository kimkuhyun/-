package _240505_주말보충;

import java.util.Scanner;
// 피보나치 수열의 n번째 항을 계산
public class _08_ForAndWhile {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("피보나치 수열의 n번째 항 입력 : ");
       int num = scanner.nextInt();
       System.out.print("0, 1, ");

       int sum = 0;
       int num1 = 0;
       int num2 = 1;
       for(int i = 2; i <= num; i++){
           sum = num1+num2;
           num1 = num2;
           num2 = sum;
           System.out.print(sum+", ");

       }


        scanner.close();
    }

}
