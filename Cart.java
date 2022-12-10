package OOP_WEEK_2;

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
			System.out.println("Maximum order is 20. Can't add to your cart");
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
	
	public void listOfItems() {
		for (int i=0;i<quantityOrdered;i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
	}
}
