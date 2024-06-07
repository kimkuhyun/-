package middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
//        2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//        사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.

        String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

        Scanner sc = new Scanner(System.in);

        System.out.println("yyyy-MM-dd 입력");
        String str = sc.nextLine();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();


        try{
            calendar.setTime(sdf1.parse(str));
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println(dayArr[dayOfWeek]);

        } catch (ParseException e) {
            System.out.println("잘못된 날짜 형식, yyyy-MM-dd 형식으로 입력!");
        }


    }
}
