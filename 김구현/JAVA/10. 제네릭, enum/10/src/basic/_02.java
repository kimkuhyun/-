package basic;

public class _02<T> {
    //2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고
    // 매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.

    private T t;

    public _02(T t) {
        this.t = t;
    }

    public _02() {

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public static <T> String add(T t1, T t2) {

        return String.valueOf(t1) + String.valueOf(t2);
    }

    public static void main(String[] args) {
        _02<String> str = new _02<>();

       System.out.println(_02.add("hello","world"));

    }
}
