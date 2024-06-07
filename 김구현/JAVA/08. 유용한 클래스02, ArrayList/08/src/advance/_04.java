package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
//        4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//        두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//        ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
        Scanner sc = new Scanner(System.in);
        int[] isInt = new int[6];

        System.out.println("6개의 정수");
        for (int i = 0; i < 6; i++) {
            isInt[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                list.add(isInt[i]+isInt[j]);
            }

        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (i == 0 && !list.get(i).equals(list.get(i + 1))) {
                System.out.print(list.get(i) + ", ");
            } else if (i == list.size() - 1 && !list.get(i).equals(list.get(i - 1))) {
                System.out.print(list.get(i) + ", ");
            } else if (i > 0 && i < list.size() - 1 && !list.get(i).equals(list.get(i - 1)) && !list.get(i).equals(list.get(i + 1))) {
                System.out.print(list.get(i) + ", ");
            }

        }
    }
}
















