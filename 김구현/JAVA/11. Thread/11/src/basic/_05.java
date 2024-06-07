package basic;

public class _05 extends Thread {
    //5. 3, 4번 문제에서 wait와 notify를 이용하여
    // 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void numPrint1(int num) {
        this.setNum(num);
        for (int i = 0; i < num+50; i++) {
            if (i % 3 == 0) {
                System.out.println("1번 실행 "+i);

                notify();

                try{
                    //2. 이 스레드를 일시정지상태로 변경
                    wait();
                } catch(InterruptedException ie){
                    System.out.println(ie.getMessage());
                }

            }

        }
    }
    public synchronized void numPrint2(int num) {
        this.setNum(num);
        for (int i = 0; i < num+100; i++) {
            if (i % 5 == 0&& i % 7 == 0) {
                System.out.println("2번 실행 " +i);

                notify();

                try{
                    //2. 이 스레드를 일시정지상태로 변경
                    wait();
                } catch(InterruptedException ie){
                    System.out.println(ie.getMessage());
                }
            }

        }
    }

}
