package ch02.ex09;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("長方形の縦の長さは？");
		int n = scanner.nextInt();
		System.out.println("長方形の横の長さは？");
		int m = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}