package basic.worker;

public class Worker {
    public String go;
    public String back;
    public String work;

    public Worker(){

    }

    public void workerGo(){
        System.out.println("출근");
    }
    public void workerback(){
        System.out.println("퇴근!");
    }
    public void workerWork(){
        System.out.println("일.");
    }

}
