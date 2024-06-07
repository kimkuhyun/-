package basic;

public class _01 {
    //1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고
    // 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 각각의 스레드를 실행하십시오.
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i < 21; i++) {
                    if (30 % i == 0) {
                        System.out.println(Thread.currentThread().getName() + "\t" + i);
                    }
                }
            }
        });
        t1.start();

        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }


        }
    }
}
