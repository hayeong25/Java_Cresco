package ch05.sp03;

public interface Printer {
	void print(String message);

	default void testPrint() {
		print("---テスト印刷---");
	}
}
