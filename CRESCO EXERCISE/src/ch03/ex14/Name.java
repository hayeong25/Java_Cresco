package ch03.ex14;

public class Name {
	private String firstName;
	private String familyName;

	public void setFirstName(String name) {
		firstName = name;
	}

	public void setFamilyName(String name) {
		familyName = name;
	}

	public String getFullName() {
		String result = familyName + firstName;
		
		return result; // String 返還
	}
}