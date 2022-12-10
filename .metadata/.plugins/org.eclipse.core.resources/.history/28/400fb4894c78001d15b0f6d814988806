package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.test.cd.*;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private static int numberofDisc=0;
	private List<Track> TrackList = new ArrayList<Track>();
	public CompactDisc(String title, String 
			category, float cost, int length,String director,String artist) {
		super(numberofDisc,title,category,cost,length,director);
		this.artist =artist;
		numberofDisc++;
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}
	
	public boolean addTrack(Track newTrack) {
		if (TrackList.contains(newTrack)) {
			return false;
		}
		else {
			TrackList.add(newTrack);
			return true;
		}
	}
	
	public void removeTrack(Track newTrack) {
		if (!TrackList.contains(newTrack)) {
			System.out.println("This track's already in the list");
		}
		else {
			TrackList.remove(newTrack);
			System.out.println("Removed track");
		}
	}
	
	public int getLength() {
		int length =0;
		for (int i=0;i<TrackList.size();i++) {
			length+= TrackList.get(i).getLength();
		}
		return length;
	}
	@Override
	public void play() {
		for (int i=0;i<TrackList.size();i++) {
			TrackList.get(i).play();
		}
	}
	
	public String toString() {
		String tracks = new String();
		for (Track t:TrackList) {
			tracks.concat(t.toString()+"\n");
		}
		return (this.title+" "+this.category+" "+this.artist+" "+this.director+" "+Integer.toString(this.length)+Float.toString(this.cost)+tracks);
	}
}
