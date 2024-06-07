package adcance;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        //1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
        //     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
        //     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
        //     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력");
        String str = sc.nextLine();

        StringBuilder sb1 = new StringBuilder(str);

        for(int i = 1; i < sb1.length(); i++) {

            if (sb1.charAt(i) == sb1.charAt(i - 1)) {
                sb1.deleteCharAt(i);
                i--;
            }
        }


        System.out.println(sb1);
    }




    }

