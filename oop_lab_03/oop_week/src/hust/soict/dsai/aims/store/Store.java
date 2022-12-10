package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;
public class Store {
	private static final int MAX_NUMBERS = 100;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS];
	private int discQuantity;
	public Store() {
		discQuantity =0;
	}
	public int getDiscQuantity() {
		return discQuantity;
	}
	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore[discQuantity] = disc;
		discQuantity += 1;
	}
	
	public void removeDVD(String title) {
		int i=0;
		while (!itemsInStore[i].getTitle().equals(title)) {
			i++;
		} 
		while (i < discQuantity) {
			itemsInStore[i] = itemsInStore[i+1];
			i++;
		}
		discQuantity -= 1;
	}
	public void printStore() {
		for (int i=0;i<discQuantity;i++) {
			System.out.println(itemsInStore[i].getTitle());
		}
	}
	
}