package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        //3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
        //    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
        //    ex) [1, 2, 3, 4, 5] => 4, 5 출력
        List<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int[] isInt = new int[5];

        System.out.println("정수 5개");
        for (int i = 0; i < 5; i++) {
             isInt[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            list.add(isInt[i]);
        }

        Collections.sort(list);

        int first = list.get(3);
        int second = list.get(4);

        System.out.println(first + ", " + second);








    }
}
