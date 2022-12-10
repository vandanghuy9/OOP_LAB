package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.*;
public class StoreTest {
	public static void main(String[] args) {
		Store newStore = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","cartRoger Allers",87,19.95f);
		newStore.addDVD(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","Georgle Lucas",87,24.95f);
		newStore.addDVD(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		newStore.addDVD(dvd3);
		System.out.println("New Store:");
		newStore.printStore();
		newStore.removeDVD("Aladin");
		System.out.println("New Store after deleted:");
		newStore.printStore();
	}
}
