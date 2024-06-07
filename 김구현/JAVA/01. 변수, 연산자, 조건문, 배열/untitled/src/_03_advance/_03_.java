package _03_advance;

import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 입력 : ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++) {
            for(int j = rows - 1; j>= i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
