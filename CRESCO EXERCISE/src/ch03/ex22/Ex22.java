package ch03.ex22;

public class Ex22 {

	public static void main(String[] args) {
		Counter c1 = new Counter();

		for(int i=0; i<100; ++i){
			c1.countUp();
		}
		
		System.out.println(c1.getCount());
		
		c1.reset();

		System.out.println(c1.getCount());
		c1.setMax(100);
		
		for(int i=0; i<100; ++i){
			c1.countUp();
		}
		System.out.println(c1.getCount());
	}
}