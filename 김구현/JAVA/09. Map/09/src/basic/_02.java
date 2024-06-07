package basic;

import java.util.HashMap;
import java.util.Map;

public class _02 {
    //이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고,
    // 특정 이름의 전화번호를 조회하는 기능을 구현하세요.
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("김구현", "010-5018-6847");

        String serchname = null;
        String phoneNumber = map.get(serchname);
        if(phoneNumber != null) {
            System.out.println(phoneNumber);
        }else {
            System.out.println(serchname+"의 전화번호를 찾을 수 없습니다.");
        }
    }
}
