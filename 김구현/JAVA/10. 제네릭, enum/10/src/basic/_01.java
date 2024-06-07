package basic;

public class _01<T> {
    //1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.
    private T t;

    public _01(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}
