package ch09.ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[] aWeights = { 70, 50, 45, 60, 55 };
		int[] bWeights = { 80, 60, 70, 50 };

		int[] weightList = new int[aWeights.length + bWeights.length];
		
		int index = 0;
		for(int w : aWeights){
			weightList[index] = w;
			index++;
		}

		for(int w : bWeights){
			weightList[index] = w;
			index++;
		}
		
		int sum = 0;
		for (int w : weightList) {
			sum += w;
		}

		System.out.println("全体平均：" + (double)sum/weightList.length);
	}
}
