package hust.soict.dsai.test.cd;

public class CD {
	private final int numberOfTracks;
	private int id;
	private String title;
	private String category;
	private String artist;
	private String director;
	private int length;
	private double price;
	private Track[] TrackList;
	private static int numberofCD =0;
	public CD(int id, String title, String category, String artist, String director, double price,int numberOfTracks, Track[] track) {
		this.id = numberofCD;
		numberofCD ++;
		this.title = title;
		this.category = category;
		this.artist = artist;
		this.director = director;
		this.price = price;
		this.numberOfTracks = numberOfTracks;
		TrackList = new Track[numberOfTracks];
		TrackList = track;
		for (int i=0;i<numberOfTracks;i++) {
			this.length += TrackList[i].getLength();
		}
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void playTrack(int i) {
		System.out.println(TrackList[i].getTitle()+":"+TrackList[i].getLength()+"s");
	}
	public void playCD() {
		System.out.println("---------"+getTitle()+"------------");
		System.out.println("Length: "+getLength());
		for (int i=0;i<TrackList.length;i++) {
			playTrack(i);
		}
	}
	
}
