package _04_baic;

public class ConcatString_02 {
    //2. ConcatString 클래스를 하나 만들고
    // String 타입의 값 2개를 매개변수로 받아서
    // 문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.

    public String stringConcat(String a, String b) {
        return a + b;
    }


    public static void main(String[] args) {
        ConcatString_02 cs = new ConcatString_02();
        System.out.println(cs.stringConcat("Hello", "World"));
    }
}
