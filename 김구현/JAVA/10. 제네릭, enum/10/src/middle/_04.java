package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _04 {
    //4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드
    // getOverHundr를 구현하세요. 매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고
    // 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.

    public static <K,V> List<Entry<Integer, Integer>> getOverHundr(Map<Integer, Integer> map) {
        List<Entry<Integer, Integer>> list = new ArrayList<>();
        map.put(50,15);
        map.put(51,16);
        map.put(52,17);
        map.put(53,18);
        map.put(54,19);
        map.put(55,20);
        map.put(56,21);
        map.put(57,22);
        map.put(58,23);
        map.put(59,24);
        map.put(60,25);
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() * entry.getKey() > 1000) {
                list.add(entry);
            }
        }
        return list;
    }
}
