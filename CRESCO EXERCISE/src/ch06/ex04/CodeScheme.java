package ch06.ex04;

class CodeScheme {
	public boolean checkFormat(String code) throws IllegalFormatException {
		boolean check = false;
		
		if((code.charAt(0) != 'S') && (code.length() == 5)) {
			throw new IllegalFormatException("初めの一文字が規定された文字ではありません。");
		}
		else if((code.charAt(0) == 'S') && (code.length() != 5)) {
			throw new IllegalFormatException("規定された文字数ではありません。");
		}
		else {
			check = true;
		}
		
		return check;
	}
}