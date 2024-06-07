package _240518_주말보충;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06 {
    //주어진 문자열에 포함된 모든 숫자의 합을 구하는 자바 프로그램을 작성하세요. 문자열에는 임의의 문자와 숫자가 포함될 수 있으며, 숫자는 연속되지 않을 수도 있습니다.
    //
    //예시:
    //
    //입력: "ab2c4d1e5"
    //출력: 12
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> charList = new ArrayList<>();

        System.out.println("숫자를 포함한 문자열 입력");
        String word = scanner.nextLine();

        int sum = word.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);

        //chars >> CharSequence을 intStream으로 변환 각 문자는 유니코드 코드 포인트(정수값)으로 매핑 >>
        // 문자열의 각 문자에 대한 스트림을 얻을 수 있음
        //getNumericValue >> 주어진 문자에 대한 숫자 값 반환, 숫자가 아닌경우 -1 반환



    }
}
