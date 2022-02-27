package ch09.ex04;

public class Book {
	private String author; // 著者

	private String isbn; // ISBN

	private String title; // タイトル

	public Book(String author, String isbn, String title) {
		this.author = author;
		this.isbn = isbn;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}
}
