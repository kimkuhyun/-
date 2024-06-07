package advance;

public abstract class AbstractEmployee {
    public int eno;
    public String name;
    public int pay;
    public int type;
//===========================================================

    public AbstractEmployee(){

    }
    public AbstractEmployee(int eno, String name, int pay, int type) {
        this.eno = eno;
        this.name = name;
        this.pay = pay;
        this.type = type;
    }

    public abstract double getMonthPay(int bonus);
    public  void showEmployeeInfo(){
    }





}
