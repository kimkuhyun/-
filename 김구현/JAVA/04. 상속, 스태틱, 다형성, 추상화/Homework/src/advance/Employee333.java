package advance;

public class Employee333 extends AbstractEmployee {

    @Override
    public double getMonthPay(int day) {
        double workDay = (double)pay * day;
        return workday;
    }
    @Override
    public  void showEmployeeInfo(){

    }
}
