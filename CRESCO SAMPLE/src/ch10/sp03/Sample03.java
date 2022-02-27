package ch10.sp03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample03 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\doc\\author.txt");
				BufferedReader br = new BufferedReader(fr)) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
