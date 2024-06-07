package middle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.util.Calendar.JULY;

public class _03 {
    public static void main(String[] args) {
        //3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
        //     시 분 초 형태로 나타내시오.
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2023,Calendar.MARCH,15,20,31,45);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2021,JULY,8,11,58,4);

        long diff = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();

        System.out.println(diff);

        long diffSeconds = diff / 1000;
        long diffMinutes = diffSeconds/60;
        long diffHours = diffMinutes / 60;

        diffSeconds %= 60;
        diffMinutes %= 60;

        System.out.println(diffHours+"시"+diffMinutes+"분"+diffSeconds+"초");

    }
}
