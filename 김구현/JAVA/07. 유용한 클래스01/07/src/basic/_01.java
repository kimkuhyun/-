package basic;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        //1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).

        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer(3);
        String[] str = new String[3];

        System.out.println("문자열");
        for (int i = 0; i < 3; i++) {
             str[i] = sc.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            sb.append(str[i]);
        }


        System.out.println(sb);
    }
}
