package basic;

import java.util.List;

public class _05<T extends Number> {
    //5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서
    // 리턴하는 메소드 getMin을 구현하세요.
    public  double getMin(List<T> list) {
        double min = Double.MAX_VALUE;
        for (T num : list) {
            if (min > num.doubleValue()) {
                min = num.doubleValue();
            }
        }
        return min;
    }
}
