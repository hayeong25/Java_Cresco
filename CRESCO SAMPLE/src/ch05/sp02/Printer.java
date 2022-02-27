package ch05.sp02;

public interface Printer {
	int majorVer = 1;
	int minorVer = 2;

	static String getVersion() {
		return "ver" + majorVer + "." + minorVer;
	}

	void print(String message);
}
