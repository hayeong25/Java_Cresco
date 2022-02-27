package ch03.sp08;

// 当たりを判定するルールクラス
public class Rule {
	private int hitNumber;	// 当たりの番号
	public Rule(int number){
		hitNumber = number;
	}
	public void check(Box box){	// 当たり番号の有無の確認
		int number;
		while((number = box.get()) != 0){
			if( number == hitNumber ){
				System.out.println("当たり");
				return;
			}
		}
		System.out.println("はずれ");
	}
}
