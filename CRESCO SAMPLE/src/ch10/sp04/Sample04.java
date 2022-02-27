package ch10.sp04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sample04 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("C:\\doc\\language.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Java");
			bw.newLine();
			bw.write("PHP");
			bw.newLine();
			bw.write("Ruby");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
