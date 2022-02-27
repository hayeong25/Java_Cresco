package ch06.sp01;

public class Sample01 {
	public static void main(String[] args){
		String str = "あいうえお";
		while(true){
			str = new String(str + str);
		}
	}
}
