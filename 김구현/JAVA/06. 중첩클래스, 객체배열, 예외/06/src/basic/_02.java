package basic;

import java.util.Scanner;


public class _02 {
//    2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//    대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u

                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    System.out.println("입력한 문자열에서 알파벳 모음 제거");
                    String input = sc.nextLine();
                    String result = "";

                    for (int i = 0; i < input.length(); i++) {
                        char ch = input.charAt(i);
                        if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                            result +=ch;
                        }
                    }


                    System.out.println(result);
                }
            }



