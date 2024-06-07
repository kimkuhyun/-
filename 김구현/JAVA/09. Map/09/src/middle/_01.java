package middle;

import java.util.HashMap;
import java.util.Map;

public class _01 {
    public static void main(String[] args) {
        //1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
        //  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)
        Map<String, Integer> sudentScore = new HashMap<>();

        sudentScore.put("김구현",98);
        sudentScore.put("최효원",100);
        sudentScore.put("신동진",88);
        sudentScore.put("정민재",80);

        int topScore = 0;
        String topStudent = "";

        for(Map.Entry<String, Integer> entry : sudentScore.entrySet()){
            if(entry.getValue() > topScore){
                topScore = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println(topStudent +":"+topScore);






    }
}
