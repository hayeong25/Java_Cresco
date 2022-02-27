package test;

/*
* [設問2]
* 明るさの度合い（light:0～100の整数値）を3段階に分類し結果を表示する。
* ・0～30:暗い
* ・31～70:普通
* ・71～100：明るい
* ・それ以外：おかしな値
*/

public class Test2 {
	public static void main(String[] args) {
		int light = 50;
		
		if(light > 70) {
			System.out.println("明るい");
		}
		else if(light > 30) {
			System.out.println("普通");
		}
		else if(light >= 0) {
			System.out.println("暗い");
		}
		else {
			System.out.println("おかしな値");
		}
	}
}