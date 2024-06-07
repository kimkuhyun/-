import java.util.Scanner;

public class _02_분해합 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int result = 0;
            for(int i =1; i< number; i++){
                int temp = i;
                int sum = i;
                while(temp != 0){
                    sum += temp % 10;
                    temp /= 10;
                }
                if(sum == number){
                    result = i;
                    break;
                }
            }
            System.out.println(result);
            scanner.close();

    }
}
/*분해합

123 >>> 129(123+1+2+3) 여기서 123은 생성자. 129는 분해합

입력값은 하나, 분해합
결과값인 분해합을 이용해 생성자를 찾는다. 목적 1
출력값은 하나, 생성자
*/

