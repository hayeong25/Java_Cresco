package ch10.ex03;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("保存したいメモを入力してください。");

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			String line = reader.readLine();
			try (FileWriter writer = new FileWriter("memo.txt", true)) {
				line = line + "\r\n";
				writer.write(line);
			}
			System.out.println("ファイルに保存しました。");
		} catch (IOException e) {
			System.out.println("ファイルの保存に失敗しました。");
		}
	}
}
