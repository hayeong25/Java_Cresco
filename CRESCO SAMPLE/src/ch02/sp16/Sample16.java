package ch02.sp16;

public class Sample16 {
	public static void main(String[] args) {
		int[] height = new int[4];
		height[0] = 160;
		height[1] = 165;
		height[2] = 170;
		height[3] = 175;
		for(int h : height){
			System.out.println("この人の身長は"+ h + "cm です。");
		}
	}
}
