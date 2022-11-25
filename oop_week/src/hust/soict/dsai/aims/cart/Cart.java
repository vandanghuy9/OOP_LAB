package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.*;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; 
	private int quantityOrdered;
	public Cart() {
		quantityOrdered = 0;
	}
	
	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc newDisc) {
		if (quantityOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[quantityOrdered] = newDisc;
			quantityOrdered ++;
			System.out.println("the disc has been added");
		}
		else {
			System.out.println("Maximum order is"+Integer.toString(MAX_NUMBERS_ORDERED)+ ". Can't add to your cart");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] newDisc) {
		
		if (quantityOrdered >= MAX_NUMBERS_ORDERED){
			System.out.println("Maximum order is"+Integer.toString(MAX_NUMBERS_ORDERED)+ ". Can't add to your cart");
		}
		else {
			int i=0;
			do {
				itemsOrdered[quantityOrdered] = newDisc[i];
				quantityOrdered ++;
				i++;
			}while ((quantityOrdered < MAX_NUMBERS_ORDERED) && (newDisc[i] != null));
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] newDisc, int quantity) {
		
		if (quantityOrdered >= MAX_NUMBERS_ORDERED){
			System.out.println("Maximum order is"+Integer.toString(MAX_NUMBERS_ORDERED)+ ". Can't add to your cart");
		}
		else {
			int i=0;
			for (int j= quantityOrdered; j < MAX_NUMBERS_ORDERED && i<quantity ; j++) {
				itemsOrdered[j] = newDisc[i];
				i++;
				quantityOrdered++;
			}
			if (quantity + quantityOrdered > MAX_NUMBERS_ORDERED) {
				System.out.println("Can't add all your list. Full capacity is "+ Integer.toString(MAX_NUMBERS_ORDERED));
			}
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc chosenDisc) {
		int i=0;
		while (itemsOrdered[i] != chosenDisc) {
			i++;
		}
		while (i < quantityOrdered) {
			itemsOrdered[i] = itemsOrdered[i+1];
			i++;
		}
		quantityOrdered -= 1;
	}
	
	public DigitalVideoDisc findChosenDisc(String title) {
		int i=0;
		String discTitle = itemsOrdered[0].getTitle();
		while (!discTitle.equals(title)) {
			i++;
			discTitle = itemsOrdered[i].getTitle();
		}
		if (i == quantityOrdered) return null;
		return itemsOrdered[i];
	}
	
	public float printTotalPrice() {
		float totalPrice=0;
		for (int i=0;i<quantityOrdered;i++) {
			totalPrice += itemsOrdered[i].getCost();
		}
		return totalPrice;
	}
	public String toString(DigitalVideoDisc disc) {
		String itemInfor = "" ;
		itemInfor = itemInfor.concat(Integer.toString(disc.getId()));
		itemInfor = itemInfor.concat(".");
		itemInfor = itemInfor.concat("DVD - ");
		itemInfor = itemInfor.concat(" - ");
			itemInfor = itemInfor.concat(disc.getTitle());
			itemInfor = itemInfor.concat(" - ");
		if (disc.getCategory() != null) {
			itemInfor = itemInfor.concat(disc.getCategory());
			itemInfor = itemInfor.concat(" - ");
		}
		if (disc.getDirector() != null) {
			itemInfor = itemInfor.concat(disc.getDirector());
			itemInfor = itemInfor.concat(" - ");
		}
		if (disc.getLength() != 0) {
			itemInfor = itemInfor.concat(Integer.toString(disc.getLength()));
		}
		itemInfor = itemInfor.concat(" : ");
		itemInfor = itemInfor.concat(Float.toString(disc.getCost()));
		itemInfor = itemInfor.concat(" $ ");
		return itemInfor;
		
	}
	public void listOfItems() {
		System.out.println("****************** CART **********************");
		for (int i=0;i<quantityOrdered;i++) {
			System.out.println(toString(itemsOrdered[i]));
		}
		System.out.println("Total Cost: "+Float.toString(printTotalPrice()));
		System.out.println("**********************************************");
	}
}