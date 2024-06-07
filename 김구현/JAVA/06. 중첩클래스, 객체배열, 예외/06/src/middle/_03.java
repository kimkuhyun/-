package middle;

public class _03 {
    //3. 처음에 은행에 맡긴 돈은 10,000원입니다
    //   금리는 연 10%입니다
    //   복리이자로 계산했을 때 10년후 얼마가 될까요?
    public static void main(String[] args) {

        double a = 10000;
        double b = 1.1;
        double c = a;
        for (int i = 1; i <= 10; i++) {
            c *= b;
        }

        System.out.println(c);
    }
}
