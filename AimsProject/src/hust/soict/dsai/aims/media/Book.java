package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	private int length;
	private static int numberOfBooks =0;
	public Book(String title, String category, float cost,int length) {
		super(numberOfBooks,title,category,cost);
		this.length =length;
		numberOfBooks++;
	}
	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Added to author list");
		}
		else {
			System.out.println("This author's already in authors's list");
		}
	}
	
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			System.out.println("Author's not in the list");
		}
		else {
			authors.remove(authorName);
		}
	}
	
	public String toString() {
		String author = new String();
		for (String t:authors) {
			author.concat(t+" ");
		}
		
		return (this.title+" "+this.category+" "+author+" "+Integer.toString(length));
		
	}
}
