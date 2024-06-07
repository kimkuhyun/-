import java.util.Scanner;

public class _04_체스판 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        char[][] table = new char[N][M];
        for(int i = 0; i< N ; i++){
            table[i] = scanner.nextLine().toCharArray();
        }
        int result = Integer.MAX_VALUE;

        for(int i = 0; i <= N-8 ; i++){
            for(int j = 0; j<= M-8 ; j++){
                int white = count(table, i, j, true);
                int black = count(table, i, j, false);
                int temp = Math.min(white, black);
                result = Math.min(result, temp);
            }
        }

        System.out.println(result);
        scanner.close();
    }
    public static int count(char[][] board, int startRow, int startCol, boolean white ){
        char expect;
        int count = 0;
        for(int i = 0; i< 8 ; i++){
            for(int j = 0; j< 8 ; j++){
                if((i+j)%2 == 0){
                    expect = white ? 'W' : 'B';
                }else{
                    expect = white ? 'B' : 'W';
                }
                if(board[startRow+i][startCol+j] != expect){
                    count++;
                }
            }
        }
        return count;

    }
}
/*체스판 칠하기

체스판의 가로, 세로를 입력 받고 그 값을 입력받는다. 입력 값은 총 세 개.

입력받은 체스판이 8x8보다 클 경우 8x8로 잘라야함. 목적1.

체스판은. 블랙과 화이트가 번갈아가면서 나와야함 만약 번갈아 가며 나오지 않을 경우 값을 수정해야 함. 목적2

수정해야할 값이 가장 작은 곳을 골라서. 8x8로 만들어야함.목적 3

수정 값이 가장 작은 부분을 찾아 수정값을 출력

>> 즉. 문제가 12x15로 입력이 됐을 경우. 0x0 인덱스부터 8x8로 잘라 값을 전부 변경,
해당 임시 체스판에서 수정한 값을 결과값으로 출력할 변수와 비교해서 결과값 보다
작을 경우 결과값에 대입, 이것을 끝까지 반복한 후 결과값을 출력한다.
 */
