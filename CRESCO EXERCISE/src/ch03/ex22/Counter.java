package ch03.ex22;

public class Counter {
	private int countMax = 3; // finalと設定すると定数になり、値の変換不可になる
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