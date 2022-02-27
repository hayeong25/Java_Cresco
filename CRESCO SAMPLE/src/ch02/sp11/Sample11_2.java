package ch02.sp11;

public class Sample11_2 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=5){
			if(i%2 == 0){
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
