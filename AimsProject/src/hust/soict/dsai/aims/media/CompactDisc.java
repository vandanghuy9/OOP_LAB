package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.exception.PlayerException;
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
		return length;
	}
	@Override
	public void play() throws PlayerException{
		if (this.length > 0) {
			Iterator iter = TrackList.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track)iter.next();
				try {
					nextTrack.play();
				}catch(PlayerException e) {
					throw e;
				}
			}
		}
		else {
			throw new PlayerException("CD length is non-positive");
		}
		
		for (Track track : TrackList) {
            try {
                track.play();
            } catch (PlayerException e) {
                throw new RuntimeException(e);
            }
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
