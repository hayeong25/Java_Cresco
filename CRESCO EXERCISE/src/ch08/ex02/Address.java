package ch08.ex02;

public class Address {
	private String prefecture;// 都道府県

	private String city; // 市区町村

	private String houseNumber; // 番地

	private String other; // マンション名など

	public Address(String preprefecture, String city, String houseNumber,
			String other) {
		this.prefecture = preprefecture;
		this.city = city;
		this.houseNumber = houseNumber;
		this.other = other;
	}

	public void showAddress() {
		System.out.println("私は" + prefecture + city + houseNumber + other
				+ "に住んでいます。");
	}
}
