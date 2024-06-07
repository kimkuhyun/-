import java.util.Scanner;

public class _02별찍기2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for(int j = 0; j < N-i; j++){
                System.out.print(" ");
            }for(int j = N-i; j < N; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();

    }
}
