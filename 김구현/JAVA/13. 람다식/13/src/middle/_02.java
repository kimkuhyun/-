package middle;

import java.util.Scanner;

public class _02 {
    //2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와
    // 역순으로 변경하는 메소드 reverseSb를 각각 선언하고 StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열입력");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.println("문자열입력");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());


        StringBuilderUtils appendSb = (s1, s2) -> s1.append(s2);

        StringBuilderUtils2 reverseSb = StringBuilder::reverse;

        StringBuilder combineStrBuilder = reverseSb.reverseSb(appendSb.appendSb(sb1, sb2));
        System.out.println(combineStrBuilder.toString());

    }

}
