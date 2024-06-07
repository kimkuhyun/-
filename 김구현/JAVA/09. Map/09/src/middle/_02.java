package middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _02 {
    public static void main(String[] args) {
        //매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 큰
        // Entry를 리턴하는 메소드 getMaxMul을 구현하세요.


    }
    public static Entry<Integer, Integer> getMap(Map<Integer, Integer> map) {
        if(map == null ||map.isEmpty()){
            return null;
        }
        Entry<Integer, Integer> maxEntry = null;
        long maxMul = 0L;
        for(Entry<Integer, Integer> entry : map.entrySet()){
            long currentMul = entry.getKey()*entry.getValue();
            if(currentMul > maxMul){
                maxMul = currentMul;
                maxEntry = entry;
            }

        }

        return maxEntry;

    }
}
