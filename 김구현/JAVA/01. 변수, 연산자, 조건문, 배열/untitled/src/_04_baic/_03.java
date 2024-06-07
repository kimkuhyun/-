package _04_baic;

public class _03 {
    //2번에서 만든 메소드를 오버로딩해서
    // String 타입의 값 2개와 int 타입의 값 1개를 매개변수로 받아서
    // 문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.

    public String stringConcat(String a, String b, int c) {
        return a + b + c;
    }



    public static void main(String[] args) {
        _03 obj = new _03();
        System.out.println(obj.stringConcat("Hello", "World", 1));


    }
}
