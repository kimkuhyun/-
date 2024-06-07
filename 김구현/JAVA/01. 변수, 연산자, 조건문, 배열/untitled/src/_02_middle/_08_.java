package _02_middle;

public class _08_ {
    public static void main(String[] args) {

        for(int k = 0; k <= 5; k++ ) {
            for (int l = 0; l <= 5; l++) {
                if (l <= k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }



    }
}
