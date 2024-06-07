package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03 {
//    3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();

        System.out.println("정수 5개 입력 ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            intList.add(scanner.nextInt());
        }

        System.out.println(intList);

    }
}
