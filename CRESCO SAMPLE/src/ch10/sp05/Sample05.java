package ch10.sp05;

import java.io.*;

public class Sample05 {
	public static void main(String[] args) {
		try {
			BufferedReader reader 
				= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("整数を入力してください");
			int num = Integer.parseInt(reader.readLine()); 
			System.out.println(num + "が入力されました。");
		}catch(IOException e) { 
			e.printStackTrace();
		}
	}
}