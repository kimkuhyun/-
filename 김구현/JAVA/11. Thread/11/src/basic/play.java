package basic;

public class play extends Thread {

    public static void main(String[] args) {
        _05 a = new _05();

        Thread t1 = new Thread(() -> a.numPrint1(1));
        Thread t2 = new Thread(() -> a.numPrint2(1));

        t1.start();
        t2.start();









    }

}
