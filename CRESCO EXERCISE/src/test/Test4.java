package test;

/*
* [設問4]
* "赤色","青色","黄色"の3つの文字列を要素とする配列を作成し、その中身を表示する
*
* ◆出力例◆
* 赤色
* 青色
* 黄色
*
*/

public class Test4 {
	public static void main(String[] args) {
		String[] color = {"赤色", "青色", "黄色"};
		
		for(int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}
	}
}