package ch02.ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("H, J, K, L の中で１つ文字を入力してください。");
		
		String s = scanner.next();
		
		switch(s) {
		case "H" :
			System.out.println("左です");
			break;
		case "J" :
			System.out.println("下です");
			break;
		case "K" :
			System.out.println("上です");
			break;
		case "L" :
			System.out.println("右です");
			break;
		default :
			System.out.println("該当するものがありません");
			break;
		}
	}
}