package middle;

import java.util.Scanner;

public class _01 {
    //1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요.
    //    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력");
        String str = sc.nextLine();

        String newStr = str.replaceAll("\\s+","");

        int length = newStr.length();
        int middle = length / 2;

        if (newStr.length() % 2 != 0) {
            System.out.println(newStr.valueOf(newStr.charAt(middle)));
        } else if (newStr.length() % 2 == 0) {
            System.out.println(newStr.substring(middle-1, middle+1));
        }


    }
}
