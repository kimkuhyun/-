package basic;

public class _04 extends Thread {
//4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지
// 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요

private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public synchronized void numPrint1(int num) {
        this.setNum(num);
        for (int i = 0; i < num+50; i++) {
            if (i % 3 == 0) {
                System.out.println("1번 실행 "+i);
            }
        }
    }
    public synchronized void numPrint2(int num) {
        this.setNum(num);
        for (int i = 0; i < num+100; i++) {
            if (i % 5 == 0&& i % 7 == 0) {
                System.out.println("2번 실행 " +i);
            }
        }
    }

    public static void main(String[] args) {
        _04 a = new _04();

        a.numPrint1(1);
        System.out.println("===");
        a.numPrint2(2);



    }

}
