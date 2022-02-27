package ch03.ex20;

public class Ex20 {

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
	}
}
