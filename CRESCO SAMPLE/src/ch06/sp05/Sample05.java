package ch06.sp05;

public class Sample05 {
	public static void main(String[] args) {
		try {
			int[] height;
			height = new int[5];
			height[8] = 185;
		} catch (Exception e) {
			System.out.println("エラー");
			return;
		} finally {
			System.out.println("最後に必ず実行したい処理です。");
		}
	}

}
