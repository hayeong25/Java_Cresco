package ch09.ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		int[] aWeights = { 70, 50, 45, 60, 55 };
		int[] bWeights = { 80, 60, 70, 50 };

		List<Integer> weightList = new ArrayList<Integer>();
		for(int w : aWeights){
			weightList.add(w);
		}

		for(int w : bWeights){
			weightList.add(w);
		}
		
		int sum = 0;
		for (int w : weightList) {
			sum += w;
		}
		System.out.println("全体平均：" + (double)sum/weightList.size());
	}
}
