package hust.soict.dsai.test.cd;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.*;
public class Track implements Playable {
	private String title;
	private int length;
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void play() throws PlayerException{
		System.out.println("Track: "+this.title);
		System.out.println("Length: "+this.length);
	}
	
	@Override 
	public boolean equals(Object o) {
		Track a = (Track) o;
		String tmp_title = a.getTitle();
		int tmp_length = a.getLength();
		if (this.title.equals(tmp_title) && this.length == tmp_length) {
			return true;
		}
		
		else return false;
	}
	
	public String toString() {
		return (this.title+":"+Integer.toString(this.length));
	}
}
