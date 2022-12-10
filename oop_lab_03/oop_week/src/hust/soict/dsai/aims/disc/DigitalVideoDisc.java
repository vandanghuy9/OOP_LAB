package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc =0;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category= category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		
	}
	
	public int getId() {
		return id;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}

	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void printDetail() {
		System.out.println("title: "+getTitle());
		System.out.println("Category: "+getCategory());
		System.out.println("Director: "+getDirector());
		System.out.println("Length: "+getLength());
		System.out.println("Cost: "+getCost());
	}
}