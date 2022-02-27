package ch03.ex19;

public class Name {
	private String firstName;
	private String familyName;

	public void setFirstName(String firstName){
		this.firstName = firstName; // 設定する名前を持ってきて、このクラスのフィールドに代入するためにはthisが必要
	}
	
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	
	public String getFullName(){
		String result = familyName + firstName;
		return result;
	}
}
