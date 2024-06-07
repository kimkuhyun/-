import java.util.Scanner;

public class _01_블랙잭 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] cards = new int[n];


            for (int i = 0; i < n; i++) {
                cards[i] = scanner.nextInt();
            }

            int max = 0;

            for (int i = 0; i < n+2; i++) {
                for (int j = i+1; j < n+1; j++) {
                    for (int k = j+1; k < n; k++) {
                        int temp = cards[i]+cards[j]+cards[k];
                        if(temp <=m && temp > max){
                            max = temp;
                        }
                    }
                }
            }
            System.out.println(max);
    }
}
/*브루트 포스

모든 경우의 수를 하나씩 모두 재현하는 것.  가장 원시적인 방법이고, 데이터의 수가 많지 않을 경우
효과적인 방법.

블랙잭

입력 값은 총 세 개 / 카드의 개수,  설정 값 ,  카드 값

총 세개의 카드를 사용해서 설정값 이하의 값들 중 설정값과 가장 가까운 값을 만들어야 한다. 목적 1

출력값은 M이하이고 카드의 합들 중 가장 큰 값

*/
