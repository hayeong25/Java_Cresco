package ch08.ex04;

public class Util {
	public static int diff(int value1, int value2) {
		int ret = value1 - value2;
		ret = Math.abs(ret);
		return ret;
	}
}
