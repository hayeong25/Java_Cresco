package ch06.sp02;

public class Sample02 {
	public static void main(String[] args) {
		int[] heights = {150, 160, 170};
		int sum = 0;
		for(int i=0; i<=heights.length;i++){
			sum += heights[i];
		}
		System.out.println("AVG:" + (double)sum/heights.length);
	}
}
