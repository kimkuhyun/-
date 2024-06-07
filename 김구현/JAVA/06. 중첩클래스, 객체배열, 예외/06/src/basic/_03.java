package basic;

public class _03 {
    public static void main(String[] args) {
        //16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용

        double dresult = 16.459;
        double ddd = Math.round(dresult * 100.0)/100.0;
        System.out.println(ddd );
    }
}
