package ch03.ex13;

public class ParkingLot {
	private Car[] cars;
	
	public ParkingLot(int size){
		cars = new Car[size];
	}

	public void putIn(Car car){
		for(int i=0; i<cars.length;i++){
			if(cars[i] == null){
				cars[i] = car;
				System.out.println("車庫番号" + i + "に車(" + car.getNumber() + ")を入れました");
				return;
			}
		}
		System.out.println("駐車場はいっぱいです");
	}
	
	public Car getOut(int number){
		if(number<0 || cars.length<=number){
			System.out.println("不正な車庫番号です");
			return null;
		}
		if(cars[number] == null){
			System.out.println("その車庫番号には車がありません");
			return null;
		}
		Car c = cars[number];
		cars[number] = null;
		System.out.println("車庫番号" + number + "から車(" + c.getNumber() + ")が出ました");
		return c;
	}
}
