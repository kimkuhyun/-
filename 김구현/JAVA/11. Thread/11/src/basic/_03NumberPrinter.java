package basic;

public class _03NumberPrinter extends Thread {
    //3. 공유객체로 사용될 클래스 NumberPrinter를 만들고
    // 멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고
    // num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 num~100까지 숫자 중 5와 7의 공배수를
    // 출력하는 메소드 numPrint2(int num)를 구현하세요.
    // 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고
    // 메인스레드에서 두 개의 스레드를 실행하세요.

    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public void numPrint1(int num) {
        this.setNum(num);
        for (int i = 0; i < num+50; i++) {
            if (i % 3 == 0) {
                System.out.println("1번 실행 "+i);
            }
        }
    }
    public void numPrint2(int num) {
        this.setNum(num);
        for (int i = 0; i < num+100; i++) {
            if (i % 5 == 0&& i % 7 == 0) {
                System.out.println("2번 실행 " +i);
            }
        }
    }

    public static void main(String[] args) {
        _03NumberPrinter a = new _03NumberPrinter();

        a.numPrint1(1);
        System.out.println("===");
        a.numPrint2(2);



    }

}
