package ch10.sp02;

import java.io.FileWriter;
import java.io.IOException;

public class Sample02 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("C:\\doc\\novel.txt")) {
			fw.write("坊っちゃん");
			fw.write("\r\n");
			fw.write("高瀬舟");
			fw.write("\r\n");
			fw.write("ボッコちゃん");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
