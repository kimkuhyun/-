package baic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03 {
    //3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고
    // 스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();

        System.out.println("문자열 10개");
        for (int i = 0; i < 10; i++) {
            stringList.add(sc.next());
        }

        stringList.stream()
                        .filter(a -> a.matches(".*[a-zA-Z]+.*"))
                                .forEach(System.out::println);

        sc.close();
    }
}
