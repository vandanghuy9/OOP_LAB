package OOP_WEEK_2;

public class assignment_1 {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		System.out.println("Total Cost is: "+ Float.toString(anOrder.printTotalPrice()));
		DigitalVideoDisc deleteDisc = anOrder.findChosenDisc("Star Wars");
		if (deleteDisc != null) {
			anOrder.removeDigitalVideoDisc(deleteDisc);
		}
		else {
			System.out.println("No found");
		}
		System.exit(0);
	}
}
