package ch09.ex04;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	private List<Book> bookList = new ArrayList<Book>();

	public void addBook(String author, String isbn, String title) {
		Book book = new Book(author, isbn, title);
		bookList.add(book);
	}

	public Book findByIsbn(String isbn) {
		for (int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			if (isbn.equals(book.getIsbn())) {
				return book;
			}
		}
		return null;
	}
}
