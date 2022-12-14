package hust.soict.dsai.test.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String title;
	private String category;
	private List<String> listAuthor = new ArrayList<String>();
	private int contentLength;
	private static int numberOfBooks =0;
	public Book(String title, String category, int length) {
		this.id = numberOfBooks;
		numberOfBooks++;
		this.title = title;
		this.category = category;
		this.contentLength = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getContentLength() {
		return contentLength;
	}
	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}
	
	
}
