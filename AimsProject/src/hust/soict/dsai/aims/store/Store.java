package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();
	public Store() {
		
	}
	public boolean addMedia(Media newItem) {
		if (!itemsInStore.contains(newItem)) {
			itemsInStore.add(newItem);
			return true;
		}
		else return false;
	}
	
	public void removeMedia(Media removeItem) {
		if (itemsInStore.contains(removeItem)) {
			itemsInStore.remove(removeItem);
			System.out.println("Remove item");
		}
		else {
			System.out.println("Item's not in the store");
		}
	}
	
	public void displayStore() {
		for (Media t:itemsInStore) {
			System.out.println(t.toString());
		}
	}
	
	public Media checkItem(String title) {
		for (Media t:itemsInStore) {
			if (t.getTitle().equals(title)) {
				return t;
			}
		}
		return null;
	}
//	public void printStore() {
//		for (int i=0;i<discQuantity;i++) {
//			System.out.println(itemsInStore[i].getTitle());
//		}
//	}
	
}

