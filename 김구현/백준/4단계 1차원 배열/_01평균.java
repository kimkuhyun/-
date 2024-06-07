import java.util.Scanner;

public class _01평균 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        double sum = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            sum += (double) arr[i] / max * 100;
        }

        System.out.println(sum/n);
        scanner.close();
    }
}
