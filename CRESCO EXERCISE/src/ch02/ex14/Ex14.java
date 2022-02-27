package ch02.ex14;

public class Ex14 {
	public static void main(String[] args) {
		String[] meals = new String[4];
		meals[0] = "ごはん";
		meals[1] = "パン";
		meals[2] = "ラーメン";
		meals[3] = "そば";
		
		for(int i = 0; i < meals.length; i++) {
			System.out.println(meals[i]);
		}
	}
}
