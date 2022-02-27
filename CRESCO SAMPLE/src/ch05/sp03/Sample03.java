package ch05.sp03;

public class Sample03 {
	public static void main(String[] args) {
		Printer[] printers = new Printer[2];
		printers[0] = new MonochromePrinter();
		printers[1] = new ColorPrinter();

		for (int i = 0; i < printers.length; i++) {
			printers[i].testPrint();
		}
	}
}
