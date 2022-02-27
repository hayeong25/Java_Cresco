package ch05.sp02;

public class MonochromePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("インターフェース：" + Printer.getVersion());
		System.out.println("白黒印刷");
		System.out.println(message);
	}
}
