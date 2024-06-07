package basic.worker;

public class Employee extends Worker {
    @Override
    public void workerGo(){
        System.out.println("출근한다!");
    }
    @Override
    public void workerback(){
        System.out.println("퇴근한다!");
    }
    @Override
    public void workerWork(){
        System.out.println("일이다!");
    }
}
