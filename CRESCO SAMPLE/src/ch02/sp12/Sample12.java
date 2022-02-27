package ch02.sp12;

public class Sample12 {
	public static void main(String[] args) {
		int[] height; // 配列の宣言
		height = new int[3]; // 3つの要素を設定できる配列の生成
		height[0] = 170; // 配列の各要素への値設定
		height[1] = 180;
		height[2] = 165;
		System.out.println("1番目の人の身長" + height[0] + "cm");
		System.out.println("2番目の人の身長" + height[1] + "cm");
		System.out.println("3番目の人の身長" + height[2] + "cm");
	}
}
