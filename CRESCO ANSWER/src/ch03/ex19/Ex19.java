package ch03.ex19;

public class Ex19 {

	public static void main(String[] args) {
		Name name = new Name();
		name.setFamilyName("山田");
		name.setFirstName("太郎");
		System.out.println(name.getFullName());
	}

}
