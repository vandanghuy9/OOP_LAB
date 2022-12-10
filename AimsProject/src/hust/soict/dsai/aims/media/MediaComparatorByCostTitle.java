package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}
	public int compare(Media a,Media b) {
		if (a.getCost() > b.getCost()) { // 2 cai khong bang nhau
			return 1;
		}
		
		if(a.getCost() == b.getCost()){
			return( a.getTitle().compareTo(b.getTitle()) );
		}
		return -1;
	}

}
