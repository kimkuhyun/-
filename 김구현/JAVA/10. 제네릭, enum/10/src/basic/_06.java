package basic;

import java.util.Map;

public class _06<K,V> {
    //6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때
    // 길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
    public void printOverTen(Map<K, V> map){
        if(map.toString().length()>=10){
            System.out.println(map);
        } else if (map.toString().length()<10) {
            System.out.println("길이가 10미만");
        }
    }
}
