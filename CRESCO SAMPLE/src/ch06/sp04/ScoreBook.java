package ch06.sp04;

public class ScoreBook {
	int[] scores = new int[10];
	int lastIndex = 0;
	public void addScore(int score){
		if(score < 0 || 100 < score){
			throw new IllegalArgumentException("引数値が0以上100以下でない");
		}
		scores[lastIndex] = score;
		lastIndex++;
	}

	public int getScore(int index){
		if(index < 0 || scores.length <= index){
			throw new IndexOutOfBoundsException("インデックス値が範囲外");
		}
		return scores[index];
	}
	
	public float average(){
		throw new UnsupportedOperationException("未実装");
	}
}