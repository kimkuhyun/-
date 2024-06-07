package middle;

import java.util.Map;
import java.util.Map.Entry;

public class _01<K extends Number, V extends  Number> {
    //1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때
    // key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.

    public Entry<K, V> getMaxMul(Map<K, V> map) {
        double max = Double.NEGATIVE_INFINITY;
        Entry<K, V> maxEntry = null;
        for(Entry<K,V> entry : map.entrySet()){
            double doub =  entry.getKey().doubleValue() * entry.getValue().doubleValue();
            if(maxEntry == null || doub  > max){
               maxEntry = entry;
               max = doub;

            }
        }

        return maxEntry;
    }
}
