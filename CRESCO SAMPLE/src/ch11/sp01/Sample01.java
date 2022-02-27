
package ch11.sp01;

public class Sample01 {
	public static void main(String[] args) { 
		ThreadA a = new ThreadA(); 
		ThreadB b = new ThreadB(); 

		a.start(); 
		b.start(); 
	}
}