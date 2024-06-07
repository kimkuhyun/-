import java.util.Scanner;

public class _05_영화감독 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int movie = scanner.nextInt();

        int count = 0;
        int result = 666;

        while (true){
            System.out.println(result);
            System.out.println("===");
            if(String.valueOf(result).contains("666")){

                count++;
                System.out.println(result);
            }
            if(count == movie){
                break;
            }
            result++;
        }

        System.out.println(result);


        scanner.close();
    }
}

/*영화감독
가장 작은 종말의 수 666, 다음으로 큰 수 1666, 2666.... 7번째로 큰 수 6660, 6661 .....

입력은 하나.
출력값은 N번째 영화제목.즉 N번째로 작은 종말의 수

**/
