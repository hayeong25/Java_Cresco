package ch03.ex13;

class ParkingLot {
	Car cars[];
	
	public ParkingLot(int size) {
		cars = new Car[size];
	}
	
	public void putIn(Car c) {
		boolean put = false;
		for(int i = 0; i < cars.length; i++) {
			if(cars[i] == null) {
				cars[i] = c;
				System.out.println("「車庫番号[" + i + "]に車[" + c.getNumber() + "]を入れました」");
				put = true;
				break;
			}
		}
		if(!put) {
			System.out.println("「駐車場はいっぱいです」");
		}
	}
	
	public Car getOut(int number) {
		Car car = null;
		
		if(number >= cars.length) { // 配列の範囲を超えている場合
			System.out.println("「不正な車庫番号です」");
			return car;
		}
		else if(cars[number] == null) {
			System.out.println("「その車庫番号には車がありません」");
			return car;
		}
		
		for(int i = 0; i < cars.length; i++) {
			if(i == number) {
				car = cars[number];
				System.out.println("「車庫番号[" + i + "]から車[" + car.getNumber() + "]が出ました」");
				cars[i] = null;
			}	
		}
		
		return car;
	}
}