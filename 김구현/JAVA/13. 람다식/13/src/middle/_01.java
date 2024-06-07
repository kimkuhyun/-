package middle;

import java.util.Scanner;

public class _01 {
    //1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후
    // 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
    //StringBuilderUtils 함수형 인터페이스 선언,
    // StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilderUtils combine = (sb1, sb2) -> {
            return sb1.append(sb2).reverse();
        };

        System.out.println("문자열입력");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.println("문자열입력");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());

        StringBuilder result = combine.appendSb(sb1, sb2);

        System.out.println("결과: " + result.toString());

        sc.close();






    }


}
