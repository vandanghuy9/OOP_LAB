package hust.soict.dsai.aims.main;

import java.util.Scanner;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
public class Aims {
	public static void showMenu() {
		System.out.println("AIMS:");
		System.out.println("--------------------------");
		System.out.println("1. View Store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Option: ");
		System.out.println("--------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Option: ");
		System.out.println("--------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu() {
		System.out.println("Option: ");
		System.out.println("--------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	public static void main(String[] args) {
		int option = 5;
		Scanner scan = new Scanner(System.in);
		Store store = new Store();
		Cart cart = new Cart();
		while (option != 0) {
			showMenu();
			option = scan.nextInt();
			switch(option) {
				case 1:{
					store.displayStore();
					int store_option =5;
					while (store_option != 0) {
						storeMenu();
						store_option = scan.nextInt();
						switch(store_option) {
							case 1:{
								System.out.println("Enter title of media:");
								String title_media = scan.nextLine();
								if (store.checkItem(title_media) != null) {
									Media foundItem = store.checkItem(title_media);
									System.out.println(foundItem.toString());
									int mediaDetailOption = 5;
									while (mediaDetailOption != 0) {
										mediaDetailsMenu();
										mediaDetailOption = scan.nextInt();
										switch(mediaDetailOption) {
										case 1:{
											try {
												cart.addMedia(foundItem);
											}catch(LimitExceededException e) {
												System.err.println(e.getMessage());
											}
											break;
										}
										case 2:{
											break;
										}
										default:{
											break;
										}
										}
									}
								}
								else {
									System.out.println("No found");
								}
								break;
							}
							
							case 2:{
								System.out.println("Enter title of media:");
								String media_title = scan.nextLine();
								if (store.checkItem(media_title) != null) {
									Media newItem = store.checkItem(media_title);
									try {
										cart.addMedia(newItem);
									}catch(LimitExceededException e) {
										System.err.println(e.getMessage());
									}
									
									System.out.println("Added to cart");
								}
								else {
									System.out.println("not in the store");
								}
								break;
							}
							case 3:{
								break;
							}
							case 4:{
								cart.listOfItems();
								break;
							}
							default:{
								break;
							}
						}
					}
				}break;
				case 2:{
					int update_option = 0;
					System.out.println("Update Option:");
					System.out.println("1. Add a media");
					System.out.println("2. Remove a media");
					System.out.println("Your choice:");
					update_option = scan.nextInt();
					switch(update_option) {
					case 1:{
						System.out.println("Type of media:");
						System.out.println("1. Book");
						System.out.println("2. Compact Disc");
						System.out.println("3. Digital Video Disc");
						System.out.println("your choice:");
						update_option = scan.nextInt();
						switch(update_option) {
						case 1:
						{
							String title,category;
							int length;
							float price;
							System.out.println("Book title: ");
							title = scan.nextLine();
							System.out.println("Category:");
							category = scan.nextLine();
							System.out.println("length:");
							length = scan.nextInt();
							System.out.println("Price:");
							price = scan.nextFloat();
							Book newBook = new Book(title,category,price,length);
							if (store.addMedia(newBook)) {
								System.out.println("Added to store");
							}
							else {
								System.out.println("Item's already in the store");
							}
							break;
						}
						case 2:{
							String title,category,director;
							int length;
							float price;
							System.out.println("Disc title: ");
							title = scan.nextLine();
							System.out.println("Category:");
							category = scan.nextLine();
							System.out.println("length:");
							length = scan.nextInt();
							System.out.println("Price:");
							price = scan.nextFloat();
							System.out.println("Director:");
							director = scan.nextLine();
							System.out.println("Artist:");
							String artist = scan.nextLine();
							CompactDisc newCD = new CompactDisc(title,category,price,length,director,artist);
							if (store.addMedia(newCD)) {
								System.out.println("Added to store");
							}
							else {
								System.out.println("Item's already in the store");
							}
							break;
						}
						case 3:{ // DVD
							String title,category,director;
							int length;
							float price;
							System.out.println("Disc title: ");
							title = scan.nextLine();
							System.out.println("Category:");
							category = scan.nextLine();
							System.out.println("length:");
							length = scan.nextInt();
							System.out.println("Price:");
							price = scan.nextFloat();
							System.out.println("Director:");
							director = scan.nextLine();
							DigitalVideoDisc newDVD = new DigitalVideoDisc(title,category,director,length,price);
							if (store.addMedia(newDVD)) {
								System.out.println("Added to store");
							}
							else {
								System.out.println("Item's already in the store");
							}
							break;
						}
						}
					}
					}
					break;
				}
				case 3:{
					cart.listOfItems();
					cartMenu();
					int cartOption = scan.nextInt();
					switch(cartOption) {
						case 1:{
							System.out.println("Choose filter option");
							System.out.println("1. Filter by id");
							System.out.println("2. Filter by title");
							System.out.println("Your choice: ");
							int filter = scan.nextInt();
							switch(filter) {
								case 1:{
									System.out.println("Enter id:");
									int id = scan.nextInt();
									Media foundItem = cart.Filter(id);
									if (foundItem != null) {
										System.out.println("Item found:");
										System.out.println(foundItem.toString());
									}
									else {
										System.out.println("No found");
									}
									break;
								}
								case 2:{
									System.out.println("Enter title:");
									String title = scan.nextLine();
									Media foundItem = cart.Filter(title);
									if (foundItem != null) {
										System.out.println("Item found:");
										System.out.println(foundItem.toString());
									}
									else {
										System.out.println("No found");
									}
									break;
								}
							}
						}break;
						case 2:{
							System.out.println("Choose sorting option");
							System.out.println("1. Sort by title");
							System.out.println("2. Sort by cost");
							System.out.println("Your choice: ");
							int filter = scan.nextInt();
							switch(filter) {
								case 1:{
									cart.sortByTitleCost();
									System.out.println("Cart after sorted:");
									cart.listOfItems();
									break;
								}
								case 2:{
									cart.sortByCostTitle();
									System.out.println("Cart after sorted:");
									cart.listOfItems();
									break;
								}
							}
						}break;
						case 3:{
							System.out.println("Enter title of media to remove:");
							String title = scan.nextLine();
							Media foundItem = cart.Filter(title);
							if (foundItem != null) {
								cart.removeMedia(foundItem);
								System.out.println("Item's removed");
							}
							else {
								System.out.println("Not in the cart");
							}
							break;
						}
						case 4:{
							System.out.println("Enter title of media:");
							String title = scan.nextLine();
							Media foundItem = cart.Filter(title);
							if (foundItem != null) {
								System.out.println(foundItem.toString());
							}
							else {
								System.out.println("Not in the cart");
							}
							break;
						}
						case 5:{
							System.out.println("Order is created");
							cart.emptyCart();
							break;
						}
						default:{
							break;
						}
					}
					break;
				}
				default:{
					break;
				}
			}
		}
	}
}
