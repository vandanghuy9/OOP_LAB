package hust.soict.globalict.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.naming.LimitExceededException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
	private static final long serialVersionUID = 1L;
	private static Cart orderList = new Cart();
	private Media media;
	private JLabel title,cost;
	private JPanel container;
	private JButton cartButton,playButton;
	public MediaStore(Media newMedia) {
		this.media = newMedia;
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		title = new JLabel(newMedia.getTitle());
		title.setFont(new Font(title.getFont().getName(),Font.PLAIN,20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		cost = new JLabel(""+newMedia.getCost()+"$");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		cartButton = new JButton("Add to cart");
		playButton = new JButton("Play");
		
		container.add(cartButton);
		if (newMedia instanceof Playable) {
			container.add(playButton);
		}
		cartButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Add to cart")) {
					try{
						orderList.addMedia(newMedia);
					}catch(LimitExceededException ex) {
						System.err.println(ex.getMessage());
					}
				}
			}
		});
		playButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (newMedia instanceof DigitalVideoDisc) {
					try {
						((DigitalVideoDisc) newMedia).play();
					}catch(PlayerException ex) {
						System.err.println(ex.getMessage());
					}
				}
				else if (newMedia instanceof CompactDisc) {
					try {
						((CompactDisc) newMedia).play();
					}catch(PlayerException ex) {
						System.err.println(ex.getMessage());
					}
				}
			}
		});
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	public JButton getCartButton() {
		return cartButton;
	}
	
	public JButton getPlayButton() {
		return playButton;
	}

}
