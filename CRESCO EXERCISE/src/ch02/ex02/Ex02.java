package ch02.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("点数を入力してください。");
		
		int score = scanner.nextInt();
		
		if(score >= 80) {
			System.out.println("大変よくできました！");
		}
		else if(score >= 60) {
			System.out.println("よくできました！");
		}
		else {
			System.out.println("もう少し頑張りましょう！");
		}
	}
}