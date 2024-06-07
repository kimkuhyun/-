package basic;

import java.util.List;

public class _03 {
    //3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
    public  static Integer sum(List<?> list){
        Integer sum = 0;
        for(Object o : list){
            sum += (Integer)o;
        }
        return sum;
    }
}
