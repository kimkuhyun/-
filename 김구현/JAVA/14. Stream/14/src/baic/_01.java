package baic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _01 {
    //1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다.
    // intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0 ; i < 10 ; i++){
            intList.add(rand.nextInt(10)+1);
        }

        intList.forEach(i -> System.out.print(i*3 + ", "));

    }
}
