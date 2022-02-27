package ch03.ex21;

public class Ex21 {

	public static void main(String[] args) {
		Worker yamada = new Worker(100);
		Worker suzuki = new Worker(30);
		
		yamada.work();
		yamada.work();
		yamada.work();
		yamada.play();
		
		suzuki.work();
		suzuki.play();
		suzuki.play();
		suzuki.play();
		
		System.out.println(Worker.getMoney());

		yamada.baseUp(50);
		suzuki.baseUp(20);

		suzuki.work();
		yamada.work();

		System.out.println(Worker.getMoney());
	}
}