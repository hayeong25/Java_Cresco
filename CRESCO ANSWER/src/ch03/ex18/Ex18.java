package ch03.ex18;

public class Ex18 {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		
		// Pointクラスのフィールドのアクセス修飾子がprivateであるため直接アクセスできない。
		// getterメソッドを用意してアクセスする必要がある。
		// Pointクラスのフィールドのアクセス修飾子をpublicにすることでコンパイルエラーは
		// なくなるが、自由に書き換えられる問題が発生してしまう。
		System.out.println("p1(x,y)=(" + p1.getX() + "," +  p1.getY() + ")");
		System.out.println("p2(x,y)=(" + p2.getX() + "," +  p2.getY() + ")");
	}

}
