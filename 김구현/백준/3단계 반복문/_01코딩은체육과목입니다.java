import java.util.Scanner;

public class _01코딩은체육과목입니다 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String A = "long int";
        String[] B = new String[n / 4];

        for (int i = 0; i < n / 4; i++) {
            if(i >=1) {
                B[i] = "long";
            }
        }

        for (String s : B) {
            if (s != null) {
                System.out.print(s + " ");
            }
        }
        System.out.print(A);
        scanner.close();
    }
}



