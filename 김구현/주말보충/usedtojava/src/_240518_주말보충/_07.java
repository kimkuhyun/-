package _240518_주말보충;

public class _07 {
    //문제: "가장 큰 사각형 찾기"
    //
    //주어진 2차원 배열에서 1로 이루어진 가장 큰 정사각형의 넓이를 찾는 Java 프로그램을 작성하십시오.
    // 배열의 값은 0 또는 1로만 구성되어 있으며, 정사각형의 넓이는 정사각형을 구성하는 1의 개수로 정의됩니다.
    //입력: 0과 1로 이루어진 2차원 배열
    //출력: 1로만 이루어진 가장 큰 정사각형의 넓이
    //
    //입력 예시:
    //
    //
    //1 0 1 1 1
    //1 1 1 1 1
    //1 1 1 1 0
    //0 1 1 1 1
    //1 1 1 1 1
    //출력 예시:
    //
    //9 (3x3 정사각형의 넓이)
    //잘모르겠음
    public static void main(String[] args) {
        int[][] matrix ={
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        int maxSide = 0;
        int rows = matrix.length, cols = matrix[0].length;
        int[][] dp = new int[rows+1][cols+1];

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(matrix[i-1][j-1]  == 1){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        System.out.println(maxSide);










    }

}
