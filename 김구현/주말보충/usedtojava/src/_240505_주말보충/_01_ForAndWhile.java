package _240505_주말보충;

public class _01_ForAndWhile {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = "hello world";


        // 배열의 요소를 거꾸로 출력
        for (int i = arr.length- 1; i >= 0; i--){

            System.out.print(arr[i] + ", ");
        }
        // 문자열을 거꾸로 출력하는 코드
        int i = str.length()- 1;
        while (i>=0){
            System.out.print(str.charAt(i) +  " " );
            i--;
        }
        //배열, 문자열을 역순으로 출력


    }
}
