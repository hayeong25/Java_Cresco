package ch02.sp14;

public class Sample14 {
	public static void main(String[] args) {
		int[] height = {160,165,170,175};
		for (int i=0; i < height.length; i++) {
			System.out.println((i+1) + "番目の人の身長は" 
			+ height[i] + "cm です");
		}
	}
}
