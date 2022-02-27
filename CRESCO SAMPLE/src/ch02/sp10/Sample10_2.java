package ch02.sp10;

public class Sample10_2 {
	public static void main(String[] args) {
		int value = 1024;
		int digit = value;
		int i=1;
		while(true){
			if( digit < 10 ){
				break;
			}
			digit = digit / 10;
			i++;
		}
		System.out.println(value +":" + i + "桁");
	}
}
