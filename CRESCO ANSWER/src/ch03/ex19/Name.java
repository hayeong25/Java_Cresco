package ch03.ex19;

public class Name {
	private String firstName;
	private String familyName;

	public void setFirstName(String firstName){
		// フィールドの変数名と仮引数の変数名が同一の場合、
		// フィールドの変数を参照するにはthisを付ける必要がある。
		// 付けない場合は、仮引数の変数を参照するため、
		// フィールドの変数に代入されない。
		// 結果、フィールドの初期値であるnullが出力される。
		this.firstName = firstName;
	}
	
	public void setFamilyName(String familyName){
		// 同上
		this.familyName = familyName;
	}
	
	public String getFullName(){
		String result = familyName + firstName;
		return result;
	}
}
