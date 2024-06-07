package middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
//        1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//        yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//        parse() 메소드를 이용하면 String -> Calendar로 변환가능)
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();

        System.out.println("날짜 입력");
        String input = scanner.nextLine();


        try{
            calendar.setTime(sdf.parse(input));
            calendar.add(Calendar.DATE, 3);
            System.out.println(sdf.format(calendar.getTime()));


        } catch (ParseException e) {
            System.out.println("잘못된 날짜 형식, yyyy-MM-dd 형식으로 입력!");
        }









    }
}
