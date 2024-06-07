package baic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02 {
    //2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여
    // 문자열의 길이가 5이상인 문자열만 출력하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();

        System.out.println("문자열 10개");
        for (int i = 0; i < 10; i++) {
            stringList.add(sc.next());
        }
        stringList.stream()
                        .filter(i -> i.length() >= 10)
                                .forEach(System.out::println);



        sc.close();

    }
}
