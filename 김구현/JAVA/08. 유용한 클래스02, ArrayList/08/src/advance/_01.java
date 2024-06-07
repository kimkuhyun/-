package advance;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class _01 {
    public static void main(String[] args) {
        //1. 2001년 12월 19일이 결혼기념일인 부부가 있다.
        //    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
        //    2022년의 결혼기념일 날짜를 구하세요.

        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.set(2001, Calendar.DECEMBER, 19);
        calendar2.set(2022, Calendar.DECEMBER, 19);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (int year = 2002; year <=2022 ; year++) {
            if(isLeapYear(year)){
                calendar2.add(calendar2.DATE, 1);
            }
        }
        System.out.println();

        System.out.println(sdf.format(calendar2.getTime()));



    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }
}