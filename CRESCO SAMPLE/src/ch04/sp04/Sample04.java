package ch04.sp04;

public class Sample04 {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Train();
		
		doAction(v1);
		doAction(v2);
	}
	
	public static void doAction(Vehicle v){
		if(v instanceof Car){
			Car car = (Car)v;
			car.beep(); // Carクラス独自のメソッド呼び出し
		}else if(v instanceof Train){
			Train train = (Train)v;
			train.announce(); // Trainクラス独自のメソッド呼び出し
		}else{
			System.out.println("未知のオブジェクトです");
		}
	}
}
