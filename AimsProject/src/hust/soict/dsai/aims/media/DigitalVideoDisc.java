package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	private int length;
	private static int nbDigitalVideoDisc =0;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(nbDigitalVideoDisc,title,category,cost,length,director);
		nbDigitalVideoDisc += 1;
	}
	
//	public DigitalVideoDisc(String title, String category, float cost) {
//		super(nbDigitalVideoDisc,title,category,cost);
//		nbDigitalVideoDisc += 1;
//	}
//
//	public DigitalVideoDisc(String title, String category, String director, float cost) {
//		super(nbDigitalVideoDisc,title,category,cost);
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.cost = cost;
//		nbDigitalVideoDisc += 1;
//		this.id = nbDigitalVideoDisc;
//	}

//	public DigitalVideoDisc(String title) {
//		this.title = title;
//		nbDigitalVideoDisc += 1;
//		this.id = nbDigitalVideoDisc;
//	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void printDetail() {
		System.out.println("title: "+getTitle());
		System.out.println("Category: "+getCategory());
		System.out.println("Director: "+getDirector());
		System.out.println("Length: "+getLength());
		System.out.println("Cost: "+getCost());
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: "+this.getLength());
	}
	public String toString() {
		return(this.title+" "+this.category+" "+this.director+" "+this.length+" "+this.cost);
	}
}
