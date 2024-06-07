package _240518_주말보충;

import java.util.Scanner;

public class _08 {
    //숫자 피라미드
    //
    //입력으로 정수 N이 주어집니다. 여러분은 1부터 시작하여 숫자를 증가시키면서 N층의 피라미드를 출력해야 합니다.
    // 각 층은 해당 층의 수만큼 숫자를 가지며, 각 숫자는 공백으로 구분됩니다.
    // 숫자가 10 이상인 경우, 숫자의 마지막 자리만 출력합니다.
    //
    //예를 들어, N=5라면 다음과 같이 출력해야 합니다:
    //    1
    //   2 3
    //  4 5 6
    // 7 8 9 0
    //1 2 3 4 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자입력");
        int n = sc.nextInt();

        int currentNumber = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i ; k++) {
                System.out.print(currentNumber % 10 + " ");
                currentNumber++;
            }
            System.out.println();

        }


    }
}
