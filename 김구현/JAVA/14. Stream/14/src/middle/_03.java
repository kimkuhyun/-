package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03 {
    //3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고
    // 스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> characterList = new ArrayList<Character>();

        System.out.println("영문자 10개");
        for (int i = 0; i < 10; i++) {
            characterList.add(sc.next().charAt(0));
        }
        characterList.stream()
                        .map(i -> Character.isLowerCase(i) ? Character.toUpperCase(i) : Character.toLowerCase(i))
                                .forEach(System.out::println);


        sc.close();
    }
}
