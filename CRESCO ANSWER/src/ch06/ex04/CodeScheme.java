package ch06.ex04;

public class CodeScheme {
	private int length = 5;

	private String headerStr = "S";

	public void checkFormat(String str) throws IllegalFormatException {
		if (str.length() != length) {
			throw new IllegalFormatException("規定された文字数ではありません。");
		}

		if (!str.startsWith(headerStr)) {
			throw new IllegalFormatException("始めの一文字が規定された文字ではありません。");
		}
	}
}
