package ch03.ex15;

public class Name {
	private String firstName;
	private String familyName;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	
	public String getFullName(){
		String result = familyName + firstName;
		return result;
	}
}
