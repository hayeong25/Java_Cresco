package ch03.ex18;

public class Point {
	int x; // privateと設定すると他のクラスでは使用できない
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}