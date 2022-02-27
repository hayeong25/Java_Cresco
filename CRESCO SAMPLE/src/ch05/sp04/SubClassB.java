package ch05.sp04;

public class SubClassB implements DefaultIF, SpecIF {
	public void foo() {
		DefaultIF.super.foo();
	}
}
