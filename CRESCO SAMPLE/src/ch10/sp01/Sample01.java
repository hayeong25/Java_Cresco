package ch10.sp01;

import java.io.FileReader;
import java.io.IOException;

public class Sample01 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("c:\\doc\\city.txt")) {
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
