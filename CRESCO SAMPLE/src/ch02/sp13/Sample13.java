package ch02.sp13;

public class Sample13 {
	public static void main(String[] args) {
		int[] height = new int[4];
		height[0] = 160;
		height[1] = 165;
		height[2] = 170;
		height[3] = 175;
		for(int i = 0; i < height.length; i++){
			System.out.println((i+1) + "番目の人の身長は" 
			+ height[i] + "cm です。");
		}
	}
}
