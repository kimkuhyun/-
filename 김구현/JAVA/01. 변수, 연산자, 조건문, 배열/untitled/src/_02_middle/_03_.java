package _02_middle;

public class _03_ {
    public static void main(String[] args) {


        int i = 1;

        while(i <= 1000) {
            if (i % 2 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("자연수 1000까지 2와 7의 공배수의 합"+i);
















    }
}
