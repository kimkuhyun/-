import java.util.Scanner;

public class _03_방정식 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int p = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int q = scanner.nextInt();
            int D = a * d - b * c;
            int Dx = p * d - b * q;
            int Dy = a * q - p * c;
            int x = Dx / D;
            int y = Dy / D;
            System.out.println(x+" "+y);
            scanner.close();
    }

}
