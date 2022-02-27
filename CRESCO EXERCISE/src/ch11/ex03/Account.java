package ch11.ex03;

public class Account {
	private int balance = 10000; // 残高
	// 預金 
	public int deposit(int money){
		System.out.println("▽預金処理－開始");
		int total = balance + money;

		// 擬似的な処理待ち
		for(int i=0; i<5000; i++) {
			for(int j=0; j<5000; j++) {
				// 何もしない
			}
		}
		balance = total;
		System.out.println("△預金処理－終了");
		return balance;
	}
	// 引出 
	public int withdraw(int money){
		System.out.println("▼引出処理－開始");
		int total = balance - money;
		// 擬似的な処理待ち
		for(int i=0; i<5000; i++) {
			for(int j=0; j<5000; j++) {
				// 何もしない
			}
		}
		balance = total;
		System.out.println("▲引出処理－終了");
		return balance;
	}
}

