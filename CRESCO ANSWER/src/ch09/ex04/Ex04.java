package ch09.ex04;

public class Ex04 {
	public static void main(String[] args) {
		Catalog catalog = createCatalog();
		
		String key = "4-7981-1302-6";
		Book book = catalog.findByIsbn(key);

		if (book != null) {
			System.out.println(key + " で検索した結果");
			System.out.println("著者は " + book.getAuthor());
			System.out.println("タイトルは " + book.getTitle());
		} else {
			System.out.println("本が見つかりません。");
		}
	}

	private static Catalog createCatalog() {
		Catalog catalog = new Catalog();
		catalog.addBook("佐藤 匡剛", "4-7741-2950-X",
						"ソースコードリーディングから学ぶJavaの設計と実装");
		catalog.addBook("正木 威寛", "4-7741-2846-5",
						"演習で学ぶソフトウェアテスト　特訓１５０問");
		catalog.addBook("筒井 彰彦", "4-7981-1302-6",
						"7つの要素で整理する業務プロセス");
		return catalog;
	}
}
