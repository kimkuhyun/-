package _240518_주말보충;

import java.util.Arrays;
import java.util.stream.Stream;

public class _01 {
    //주어진 정수 배열에서 최대값을 찾아 출력하세요.
    //
    //예시 입력: [1, 3, 5, 7, 9, 2, 4, 6, 8, 0]
    //
    //예시 출력: 9
    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        Arrays.stream(intArr)
                .max().ifPresent(i -> System.out.println(i));





    }

}
