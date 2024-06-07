package _240505_주말보충;

import java.util.Scanner;

public class _09_ForAndWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하면 소수확인");
        int primeNum = scanner.nextInt();

        boolean isPrime =true ;

        if(primeNum <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i < Math.sqrt(primeNum);i++){
                if(primeNum % 2 ==0){
                    isPrime =false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }


    }
}