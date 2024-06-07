package advance;

public class Employee111 extends AbstractEmployee{


    @Override
    public double getMonthPay(int bonus) {
        double salary = (double)pay / 12 +bonus/12;

        return salary;
    }
    @Override
    public  void showEmployeeInfo(){

    }
}
