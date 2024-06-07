import java.util.Scanner;

public class _06_설탕배달 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int min = Integer.MAX_VALUE;

        for(int bagsF = 0; bagsF <= number/5; bagsF++) {
            int remainder = number - (bagsF *5);
            if(remainder % 3 == 0){
                int bagsT = remainder / 3;
                min = Math.min(min, bagsF+bagsT);
            }
        }
        if(min == Integer.MAX_VALUE){
            System.out.println(-1);
        }else System.out.println(min);

    }
}

/**/
