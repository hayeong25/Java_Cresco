package ch03.ex22;

public class Counter {
	// final なフィールドは一度しか値を設定できない。
	// 変更可能なフィールドにするには final を削除する必要がある。
	private int countMax = 3;
	private int count = 0;
	public void countUp(){
		if(count < countMax){
			count++;
		}
	}
	public int getCount(){
		return count;
	}
	public void reset(){
		count = 0;
	}
	public void setMax(int value){
		countMax = value;
	}
}
