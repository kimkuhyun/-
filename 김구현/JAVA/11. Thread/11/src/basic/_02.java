package basic;

public class _02 {
    //2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에
    // 메인 스레드가 실행되도록 구현하세요.
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


        try{
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }


        }
    }
}

