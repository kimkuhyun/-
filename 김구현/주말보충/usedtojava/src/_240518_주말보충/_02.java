package _240518_주말보충;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02 {
    //주어진 문자열에서 각 문자가 몇 번 나타나는지를 계산하고 출력하는 프로그램을 작성하십시오.
    //
    //예제 입력: "apple"
    //
    //예제 출력:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("영어 단어 입력.");
        String str = scanner.nextLine();

        Map<Character, Integer> charMap = new HashMap<>();

        for(char c : str.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }

        System.out.println(charMap);





        scanner.close();
    }
}
