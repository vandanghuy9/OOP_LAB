package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}
	public int compare(Media a,Media b) {
		if (a.getTitle().compareTo(b.getTitle()) != 0) { // 2 cai khong bang nhau
			return a.getTitle().compareTo(b.getTitle());
		}
		
		if(a.getCost() >= b.getCost()){
			return 1;
		}
		return -1;
	}
}
