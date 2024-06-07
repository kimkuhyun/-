package _240518_주말보충;

import java.util.Scanner;

public class _05 {
    //세 정수 A, B, C가 주어집니다. 이 세 수의 곱이 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
    //
    //입력 예시:
    //A = 3
    //B = 7
    //C = 2
    //출력 예시: 짝수


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 A입력");
        int a = sc.nextInt();
        System.out.println("정수 B입력");
        int b = sc.nextInt();
        System.out.println("정수 C입력");
        int c = sc.nextInt();

        int result = a * b * c;

        if(result % 2 == 0){
            System.out.println("짝수");
        } else System.out.println("홀수");
















    }
}
