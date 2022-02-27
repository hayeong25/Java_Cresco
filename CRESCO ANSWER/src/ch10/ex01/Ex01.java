package ch10.ex01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		String fileName = "java.txt";
		try (FileReader reader = new FileReader(fileName)) {
			int i;
			char c;
			while ((i = reader.read()) != -1) {
				c = (char) i;
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("指定したファイルが見つかりません。 " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
