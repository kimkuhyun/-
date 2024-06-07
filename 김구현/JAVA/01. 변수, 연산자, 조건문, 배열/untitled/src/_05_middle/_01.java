package _05_middle;

public class _01 {
    //1. int 배열 한 개를 매개변수로 받아서
    // 역순으로 저장된 새로운 배열을 리턴하는 메소드를 구현하세요.
    // 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.
    // static의 위치는 접근제어자와 리턴타입 사이입니다.
    // (예시 public static void add(int a, int b) { return a + b; })



        public  int[] number(int[] n){

            int[] arr = new int[n.length];

            for(int i = n.length-1, j = 0; i >= 0; i--, j++){
                arr[j] = n[i];
            }
         return arr;

        }

    public static void main(String[] args) {
            _01 obj = new _01();
        int[] k = {1, 3, 5, 7, 9};
        int[] newK = obj.number(k);

        for(int i=0;i<newK.length;i++)
         System.out.println(newK[i]);

    }




}
