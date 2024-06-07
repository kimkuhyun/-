package middle;

public class Phoneinfo {

    String[] names = new String[100];
    String[] phoneNums = new String[100];

    int index = 0;

    public void insertPhoneInfo(String name, String phoneNum) {
        names[index] = name;
        phoneNums[index] = phoneNum;
        index++;
        //매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
    }

    public void printAllPhoneInfo() {
        for (int i = 0; i < index; i++) {
            System.out.println(names[i]);
            System.out.println(phoneNums[i]);
        }
        //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현
    }

    public void printPhoneInfo(int index) {
        if (index < this.index) {
            System.out.println(names[index]);
            System.out.println(phoneNums[index]);
        }
        //매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
    }
}
