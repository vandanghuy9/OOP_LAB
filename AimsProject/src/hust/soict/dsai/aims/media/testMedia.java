package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testMedia {

	public testMedia() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		CompactDisc cd = new CompactDisc("Nguyen Hien", "hello", 10, 50, "hello", "hello");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Dang Huy", "pop","adele", 10, 20f);
		Book book = new Book("Dang Huy","new artist",50f,50);
		mediae.add(book);
		mediae.add(cd);
		mediae.add(dvd);
		Collections.sort(mediae,Media.COMPARE_BY_TITLE_COST);
		for (Media media: mediae) {
			System.out.println(media.toString());
		}
	}
}
