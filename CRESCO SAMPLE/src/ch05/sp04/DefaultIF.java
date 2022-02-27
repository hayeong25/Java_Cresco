package ch05.sp04;

public interface DefaultIF {
	default void foo() {
		System.out.println("DefaultIF");
	}
}
