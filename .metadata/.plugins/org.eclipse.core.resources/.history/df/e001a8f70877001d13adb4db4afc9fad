package hust.soict.dsai.test.disc;
import javax.swing.text.WrappedPlainView;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		jungleDVD.setCost(12.3f);
		cinderellaDVD.setCost(15f);
		System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
		System.out.println("Cinderella DVD title: "+cinderellaDVD.getTitle());
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
	}
	
	public static void swap(DigitalVideoDisc o1,DigitalVideoDisc o2) {
		String tmp_title = o1.getTitle();
		o1 = new DigitalVideoDisc(o2.getTitle());
		o2 = new DigitalVideoDisc(tmp_title);
	}
	
	public static void changeTitle(DigitalVideoDisc disc,String title) {
		String oldTitle = disc.getTitle();
		disc.setTitle(title);
//		disc = new DigitalVideoDisc(oldTitle);
	}
}
