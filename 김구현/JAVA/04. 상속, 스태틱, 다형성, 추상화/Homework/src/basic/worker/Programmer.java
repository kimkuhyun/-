package basic.worker;

public class Programmer extends Worker {
   @Override
    public void workerGo(){
        System.out.println("출근이다!");
    }
    @Override
    public void workerback(){
        System.out.println("퇴근이다!");
    }
    @Override
    public void workerWork(){
        System.out.println("일한다!");
    }

}
