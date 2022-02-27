package ch06.sp03;

public class Sample03 {
	public static void main(String[] args) {
		try {
			Account a = new Account(10000);
			a.withdraw(50000);
			System.out.println("正常に引き出しが行えました");
		} catch (BalanceShortageException e) {
			System.out.println("残高不足");
			System.out.println(e.getMessage());
			
		}
	}
}
