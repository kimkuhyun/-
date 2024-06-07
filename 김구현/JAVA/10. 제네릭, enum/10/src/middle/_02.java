package middle;

public class _02<T extends Number> {
    //2.  Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고
    // T 배열을 매개변수로 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 메소드를
    // 구현하세요. 각 메소드는 double로 리턴하고 add, sub, mul, div로
    // 메소드명을 갖습니다.(Math.round()로 소수점 두자리까지만 표출)

    public double add(T a, T b) {
        double result = 0;
        result += a.doubleValue() + b.doubleValue();
        return result;
    }
    public double sub(T a, T b) {
        double result = 0;
        result += a.doubleValue() - b.doubleValue();
        return result;
    }
    public double mul(T a, T b) {
        double result = 0;
        result += a.doubleValue() * b.doubleValue();
        return result;
    }
    public double div(T a, T b) {
        double result = 0;
        result += a.doubleValue() / b.doubleValue();
        return result;
    }


}
