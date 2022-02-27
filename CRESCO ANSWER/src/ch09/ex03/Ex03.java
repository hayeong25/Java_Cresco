package ch09.ex03;

public class Ex03 {
	public static void main(String[] args) {
		WaitingRoom room = new WaitingRoom();
		room.enter("田中");
		room.enter("鈴木");
		room.enter("高橋");

		System.out.println("待合室から次の人を呼びます。");
		System.out.println(room.call() + "さん入ってください。");
		System.out.println("待合室から次の人を呼びます。");
		System.out.println(room.call() + "さん入ってください。");
		
	}
}
