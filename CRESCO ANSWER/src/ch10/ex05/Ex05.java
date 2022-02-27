package ch10.ex05;

import java.io.*;

public class Ex05 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
			System.out.println("オーストラリアの首都はどこでしょう。");
			System.out.println("1.メルボルン  2.キャンベラ  3.シドニー");
			int num = Integer.parseInt(reader.readLine());
			if (num == 2) {
				System.out.println("正解です！");
			} else {
				System.out.println("不正解！ 正解はキャンベラでした。");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
