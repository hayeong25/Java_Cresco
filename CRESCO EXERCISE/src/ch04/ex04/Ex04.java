package ch04.ex04;

public class Ex04 {
	public static void main(String[] args) {
		// 半径 8.0 cm の円を作成する
		Circle c = new Circle(8.0);

		// 円の色を設定する
		c.setColor("赤");
		
		// 縦 10.0 cm，横 20.0 cm　の長方形を作成する
		Rectangle r = new Rectangle(10, 20);

		// 長方形の色を設定する
		r.setColor("青");

		// 円を表示する
		printGraphic(c);

		// 長方形を表示する
		printGraphic(r);
	}
	
	public static void printGraphic(Graphic g){
		System.out.println("形状:" + g.getName() + ", " +
							"色：" + g.getColor() + ", " +
							"面積：" + g.calcArea() + ", " +
							"周囲の長さ：" + g.calcGirth());
	}
}