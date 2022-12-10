package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.dsai.aims.media.Media;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>(); 
	public Cart() {
		
	}
	public boolean addMedia(Media newItem) {
		if (!itemsOrdered.contains(newItem)) {
			itemsOrdered.add(newItem);
			return true;
		}
		return false;
	}
	
	public void removeMedia(Media removeItem) {
		if (itemsOrdered.contains(removeItem)) {
			itemsOrdered.remove(removeItem);
			System.out.println("Item's removed");
		}
		else {
			System.out.println("Item not in the list");
		}
	}
//	public void addDigitalVideoDisc(DigitalVideoDisc newDisc) {
//		if (quantityOrdered < MAX_NUMBERS_ORDERED) {
//			itemsOrdered[quantityOrdered] = newDisc;
//			quantityOrdered ++;
//			System.out.println("the disc has been added");
//		}
//		else {
//			System.out.println("Maximum order is"+Integer.toString(MAX_NUMBERS_ORDERED)+ ". Can't add to your cart");
//		}
//	}
//	
//	public void addDigitalVideoDisc(DigitalVideoDisc[] newDisc) {
//		
//		if (quantityOrdered >= MAX_NUMBERS_ORDERED){
//			System.out.println("Maximum order is"+Integer.toString(MAX_NUMBERS_ORDERED)+ ". Can't add to your cart");
//		}
//		else {
//			int i=0;
//			do {
//				itemsOrdered[quantityOrdered] = newDisc[i];
//				quantityOrdered ++;
//				i++;
//			}while ((quantityOrdered < MAX_NUMBERS_ORDERED) && (newDisc[i] != null));
//		}
//	}
//	
//	public void addDigitalVideoDisc(DigitalVideoDisc[] newDisc, int quantity) {
//		
//		if (quantityOrdered >= MAX_NUMBERS_ORDERED){
//			System.out.println("Maximum order is"+Integer.toString(MAX_NUMBERS_ORDERED)+ ". Can't add to your cart");
//		}
//		else {
//			int i=0;
//			for (int j= quantityOrdered; j < MAX_NUMBERS_ORDERED && i<quantity ; j++) {
//				itemsOrdered[j] = newDisc[i];
//				i++;
//				quantityOrdered++;
//			}
//			if (quantity + quantityOrdered > MAX_NUMBERS_ORDERED) {
//				System.out.println("Can't add all your list. Full capacity is "+ Integer.toString(MAX_NUMBERS_ORDERED));
//			}
//		}
//	}
//	
//	public void removeDigitalVideoDisc(DigitalVideoDisc chosenDisc) {
//		int i=0;
//		while (itemsOrdered[i] != chosenDisc) {
//			i++;
//		}
//		while (i < quantityOrdered) {
//			itemsOrdered[i] = itemsOrdered[i+1];
//			i++;
//		}
//		quantityOrdered -= 1;
//	}
//	
//	public DigitalVideoDisc findChosenDisc(String title) {
//		int i=0;
//		String discTitle = itemsOrdered[0].getTitle();
//		while (!discTitle.equals(title)) {
//			i++;
//			discTitle = itemsOrdered[i].getTitle();
//		}
//		if (i == quantityOrdered) return null;
//		return itemsOrdered[i];
//	}
//	
	public float printTotalPrice() {
		float totalPrice=0;
		for (int i=0;i<itemsOrdered.size();i++) {
			totalPrice += itemsOrdered.get(i).getCost();
		}
		return totalPrice;
	}
//	public String toString(DigitalVideoDisc disc) {
//		String itemInfor = "" ;
//		itemInfor = itemInfor.concat(Integer.toString(disc.getId()));
//		itemInfor = itemInfor.concat(".");
//		itemInfor = itemInfor.concat("DVD - ");
//		itemInfor = itemInfor.concat(" - ");
//			itemInfor = itemInfor.concat(disc.getTitle());
//			itemInfor = itemInfor.concat(" - ");
//		if (disc.getCategory() != null) {
//			itemInfor = itemInfor.concat(disc.getCategory());
//			itemInfor = itemInfor.concat(" - ");
//		}
//		if (disc.getDirector() != null) {
//			itemInfor = itemInfor.concat(disc.getDirector());
//			itemInfor = itemInfor.concat(" - ");
//		}
//		if (disc.getLength() != 0) {
//			itemInfor = itemInfor.concat(Integer.toString(disc.getLength()));
//		}
//		itemInfor = itemInfor.concat(" : ");
//		itemInfor = itemInfor.concat(Float.toString(disc.getCost()));
//		itemInfor = itemInfor.concat(" $ ");
//		return itemInfor;
//		
//	}
	public void listOfItems() {
		System.out.println("****************** CART **********************");
		for (int i=0;i<itemsOrdered.size();i++) {
			System.out.println(itemsOrdered.get(i).toString());
		}
		System.out.println("Total Cost: "+Float.toString(printTotalPrice()));
		System.out.println("**********************************************");
		
	}
	
	public Media Filter(int id) {
		for (int i=0;i<itemsOrdered.size();i++) {
			if (id == itemsOrdered.get(i).getId()) {
				return itemsOrdered.get(i);
			}
		}
		return null;
	}
	public Media Filter(String title) {
		for (int i=0;i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				return itemsOrdered.get(i);
			}
		}
		return null;
	}
	public void sortByTitleCost(){
		Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCostTitle() {
		Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
	}
	
	public void emptyCart() {
		itemsOrdered.clear();
	}
}
