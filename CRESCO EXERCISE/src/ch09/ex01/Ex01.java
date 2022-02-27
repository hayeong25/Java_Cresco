package ch09.ex01;

public class Ex01 {
	public static void main(String[] args) {
		String[] employees = new String[4];

		employees[0] = "佐藤";
		employees[1] = "鈴木";
		employees[2] = "田中";
		employees[3] = "斉藤";

		for (String employee : employees) {
			System.out.println(employee);
		}
	}
}
