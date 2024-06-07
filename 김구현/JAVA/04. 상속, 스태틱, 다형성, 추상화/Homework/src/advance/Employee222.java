package advance;

public class Employee222 extends AbstractEmployee {

    @Override
    public double getMonthPay(int year) {
        double hireYear = (double)pay/12;
        return hireYear;
    }
    @Override
    public  void showEmployeeInfo(){

    }
}
4