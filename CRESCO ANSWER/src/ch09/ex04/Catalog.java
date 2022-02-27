package ch09.ex04;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	private Map<String, Book> map = new HashMap<String, Book>();

	public Book findByIsbn(String isbn) {
		return map.get(isbn);
	}

	public void addBook(String author, String isbn, String title) {
		Book book = new Book(author, isbn, title);
		map.put(isbn, book);
	}
}
