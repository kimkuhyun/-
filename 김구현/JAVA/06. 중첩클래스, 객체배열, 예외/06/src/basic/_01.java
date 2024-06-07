package basic;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
//        1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//        0개면 '가, 바가 존재하지 않습니다.'라고 출력.
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력");
        String input = sc.nextLine();
        int gaCunt = 0;
        int baCunt = 0;
        boolean flag = false;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='가'){
                gaCunt++;
            } else if (input.charAt(i)=='바') {
                baCunt++;
            }
        }
        if(gaCunt==0&&baCunt==0){
            System.out.println("가, 바가 존재하지 않습니다.");
        }else {
            System.out.println("'가'의 개수 : " + gaCunt);
            System.out.println("'바'의 개수 : " + baCunt);
        }

    }
}
