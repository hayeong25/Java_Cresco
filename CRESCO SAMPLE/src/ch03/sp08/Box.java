package ch03.sp08;

// 5個までの数値を格納できる箱クラス
public class Box {
	private int[] cells = new int[5];
	private int topIndex = 0;	// 次に格納できる位置

	public Box put(int number){	// 値を格納する
		if(topIndex != cells.length){
			cells[topIndex] = number;
			topIndex++;
		}
		return this;
	}

	public int get(){			// 値を取り出す
		if(topIndex == 0){
			return 0;
		}
		topIndex--;
		int number = cells[topIndex];
		cells[topIndex] = 0;
		return number;
	}

	public void judge(Rule rule){	// ルールに基づいて判定する
		rule.check(this);
	}
}
