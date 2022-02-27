package ch02.sp15;

public class Sample15 {
	public static void main(String[] args) {
		int[] height1 = new int[3];
		height1[0] = 160;
		height1[1] = 165;
		height1[2] = 170;
		int[] height2;
		height2 = height1;
		System.out.println("1番目（代入先)" + height2[0] + "cm です。");
		height2[1] = 200;
		System.out.println("2番目（代入先)" + height2[1] + "cm です。");
		System.out.println("2番目（代入元)" + height1[1] + "cm です。");
	}
}
