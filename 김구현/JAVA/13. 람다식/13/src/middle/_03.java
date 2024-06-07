package middle;

import java.util.Arrays;
import java.util.Scanner;

public class _03 {
    //3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는
    // static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고
    // maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.

    public static int getMax(int[] arr){
        return Arrays.stream(arr).max().orElseThrow();
    };
    public static int getMin(int[] arr){
        return Arrays.stream(arr).min().orElseThrow();
    };
    public static int getMid(int[] arr){
        int[] a = Arrays.copyOf(arr, arr.length);
        Arrays.sort(a);
        return a[a.length/2];
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MaxMinMid max = _03 :: getMax;
        MaxMinMid min = _03 :: getMin;
        MaxMinMid mid = _03 :: getMid;

        System.out.println("최대값: " + max.maxOrMinOrMid(arr));
        System.out.println("최소값: " + min.maxOrMinOrMid(arr));
        System.out.println("중간값: " + mid.maxOrMinOrMid(arr));



    }

}
