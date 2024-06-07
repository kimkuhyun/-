package _240518_주말보충;

import java.util.Arrays;
import java.util.Comparator;

public class _04 {
    //수 배열이 주어졌을 때, 그 배열에서 두 번째로 큰 값을 찾는 프로그램을 작성하세요.
    //예시 입력:
    //plaintext
    //[10, 5, 4, 3, -1]
    //예시 출력:
    //plaintext
    //5
    public static void main(String[] args) {
        int[] intNum = {10, 5, 4, 3, -1};

        Arrays.stream(intNum)
                .distinct() //중복제거
                .boxed() // 인트 >>인티저로 박싱
                .sorted(Comparator.reverseOrder())// 내림차순으로 정렬
                .skip(1)// 1번째 인덱스부터 시작
                .findFirst()//첫 번째 요소 반환
                .ifPresent(i -> System.out.println(i));
        //findFirst는 OPtionallint 형태로 출력
        //ifPresent는 Optional 객체가 존재할 때 주어진 동작을 수행함.
        //optional 클래스는 값이 존재하는지 여부를 나타내는 컨테이너 객체로,
        // 값이 존재하는 경우에만 해당 값을 처리할 수 있도록 도와줌


    }
}
