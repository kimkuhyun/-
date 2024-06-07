package basic;

import java.util.Calendar;

public class _01 {
    //1. Calendar 객체를 오늘날짜로 생성하세요.
    //   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
    //   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR)+ "년"+
                        (calendar.get(Calendar.MONTH)+1)+"월"+
                        calendar.get(Calendar.DATE)+"일"
                );

        calendar.set(2020,3,8);
        calendar.add(Calendar.DATE, 1888);
        System.out.println(calendar.getTime());

    }
}
