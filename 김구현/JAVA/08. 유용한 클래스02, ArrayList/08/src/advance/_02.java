package advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import static java.util.Calendar.DATE;

public class _02 {
    public static void main(String[] args) throws ParseException {
        //2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
        //    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
        //    ex) 2023-01-29 2023-02-05 입력
        //	출력       2023-01-29
        //             2023-01-30
        //             2023-01-31
        //             2023-02-01
        //             2023-02-02
        //             2023-02-03
        //             2023-02-04
        //             2023-02-05

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);

        System.out.println("yyyy-MM-dd");
        String start = sc.nextLine();
        System.out.println("yyyy-MM-dd");
        String end = sc.nextLine();

        Calendar startCalendar1 = Calendar.getInstance();
        Calendar endCalendar2 = Calendar.getInstance();

        startCalendar1.setTime(sdf.parse(start));
        endCalendar2.setTime(sdf.parse(end));

        endCalendar2.add(DATE, 1);

        for(Calendar cal = startCalendar1; cal.before(endCalendar2); cal.add(DATE, 1)) {
            System.out.println(sdf.format(cal.getTime()));
        }





    }

}
