package basic;

import java.util.HashMap;
import java.util.Map;

public class _01 {
    //1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분)
    // value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        for (char cha = 'A'; cha <= 'Z'; cha++) {
            map.put(String.valueOf(cha), Integer.valueOf(cha));
        }
        for (char cha = 'a'; cha <= 'z'; cha++) {
            map.put(String.valueOf(cha), Integer.valueOf(cha));
        }

        System.out.println(map);
    }
}
