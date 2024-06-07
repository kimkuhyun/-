package _06_advance;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {
    //1. 가위, 바위, 보 게임을 RockScissPaper 클래스로 만드세요.
    //   컴퓨터가 0(가위), 1(바위), 2(보) 중 랜덤값을 하나 선택하고
    //   사용자가 가위, 바위, 보를 입력해서 사용자가 이기면 이겼습니다.
    //   지면 졌습니다. 비기면 비겼습니다.를 출력하세요.
    //   사용자가 3을 입력하면 게임이 종료되면서 몇전 몇승 몇무 몇패인지 출력하세요.


    public void start() {
        Scanner sc = new Scanner(System.in);

        int totalGame = 0;
        int wins = 0;
        int loses = 0;
        int draws = 0;

        boolean gameOver = true;

//==========================================================================================================

        while (gameOver) {
            System.out.println("가위, 바위, 보 중 하나를 입력 종료를 입력하면 게임 종료 : ");
            String userinput = sc.nextLine();

            if (userinput.equals("종료")) {
                gameOver = false;
            }
            //초기화
            else if (userinput.equals("가위") || userinput.equals("바위") || userinput.equals("보")) {
                totalGame++;
                int userChoice = convertNum(userinput);
                int computerChoice = getCom();
                String result = determine(userChoice, computerChoice);

                //승패
                if (result.equals("승리!")) {
                    System.out.println("승");
                } else if (result.equals("패배!")) {
                    System.out.println("패배!");
                } else if (result.equals("무승부")) {
                    System.out.println("무승부");
                } else {
                    System.out.println("가위, 바위, 보 중 하나만 입력!!   ");
                }


                if (result.equals("승리!")) {
                    wins++;
                } else if (result.equals("패배!")) {
                    loses++;
                } else if (result.equals("무승부")) {
                    draws++;
                }
            }

        } //while 종료

        //전적출력
        System.out.print(totalGame + "전  " + wins + "승  " + loses + "패  " + draws + "무");
        sc.close();

    }

//==========================================================================================================


    //사용자 입력 숫자로 변경
    public int convertNum(String num) {
        if (num.equals("가위")) {
            return 0;
        } else if (num.equals("바위")) {
            return 1;
        } else if (num.equals("보")) {
            return 2;
        }
        return -1;
    }

    //컴퓨터 값 입력
    public int getCom() {
        Random r = new Random();
        int val = r.nextInt(3);
        return val;
    }

    //승패 판단
    public String determine(int user, int com) {
        if (user == com) {
            return "무승부";
        } else if (user == 0 && com == 2 || user == 1 && com == 0 || user == 2 && com == 1) {
            return "승리!";
        } else {
            return "패배!";
        }

    }

}


