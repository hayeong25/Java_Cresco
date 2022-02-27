package ch11.sp02;

public class Sample02 {
	public static void main(String[] args){ 
		RunA runA = new RunA();
		RunB runB = new RunB();
		Thread a = new Thread( runA ); 
		Thread b = new Thread( runB ); 
		a.start();
		b.start();
	}
}