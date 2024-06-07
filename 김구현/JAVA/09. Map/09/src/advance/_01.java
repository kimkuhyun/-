package advance;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class _01 {
    public static void main(String[] args)  {
        //1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
        //    (Map<Character, Integer> 형태의 Map과 Entry 사용)

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력");
        String input = scanner.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        Entry<Character,Integer> mostFrequent = null;
        for(Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if(mostFrequent==null|| entry.getValue() > mostFrequent.getValue()) {
                mostFrequent = entry;
            }
        }

        if(mostFrequent != null) {
            System.out.println(mostFrequent.getKey());
            System.out.println(mostFrequent.getValue());
        }else {
            System.out.println("입력된 문자열이 없습니다.");
        }
        scanner.close();
    }
}
