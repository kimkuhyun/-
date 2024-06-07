package middle;

//package edu.exam09.homework;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {
	static int med3(int a, int b, int c) {

		if(b < a && a < c){
			return a;
		} else if(a < b && b < c){
			return b;
		} else if(a < c && c < b){
			return c;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();


		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}
