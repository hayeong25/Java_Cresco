package ch10.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		String inputFileName = "input.txt";
		String outputFileName = "output.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(
				inputFileName));
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						outputFileName))) {
			System.out.println("ファイルのコピー開始");
			String line;
			while ((line = reader.readLine()) != null) {
				line = line.replace('く', 'た');
				writer.write(line);
				writer.newLine();
			}
			System.out.println("ファイルのコピー完了");
		} catch (IOException e) {
			System.out.println("ファイルのコピーに失敗しました");
		}
	}
}
