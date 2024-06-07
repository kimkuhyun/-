package middle;

import java.util.*;

public class _03 {
    public static void main(String[] args) {
        //Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요.
        //{1: 3, 2: 4, 3: 5}
        //1 : 5
        //2 : 4
        //3 : 3
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(2,4);
        map.put(3,5);

        printKVDesc(map);



    }

    public static void printKVDesc(Map<Integer,Integer> map){

        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(Map.Entry<Integer,Integer> entry : list){
            System.out.println(entry.getKey()+":"+entry.getValue()+"\t");
        }

    }
}
