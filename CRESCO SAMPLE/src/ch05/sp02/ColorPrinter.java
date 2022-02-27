package ch05.sp02;

public class ColorPrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("インターフェース：" + Printer.getVersion());
		System.out.println("カラー印刷");
		System.out.println(message);
	}
}
