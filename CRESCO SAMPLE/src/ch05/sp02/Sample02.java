package ch05.sp02;

public class Sample02 {
	public static void main(String[] args) {
		Printer[] printers = new Printer[2];
		printers[0] = new MonochromePrinter();
		printers[1] = new ColorPrinter();
		
		for(int i=0; i<printers.length; i++){
			printers[i].print("こんにちは");
		}
	}
}

