package middle;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class _02 {
    //2. "유용한 클래스는 많다.
    // 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때
    // 사용자가 정수를 입력하고 위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가
    // 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");

        System.out.println("정수 입력");
        int number = sc.nextInt();

        StringBuffer reSb = sb.reverse();
        String str = reSb.toString();

        System.out.println(str.charAt(number));







    }
}
