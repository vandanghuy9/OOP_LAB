package hust.soict.globalict.swing;

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SwingAccumulator extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField tfInput;
	private JTextField tfOutput;
	private int sum =0;
	public SwingAccumulator() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,2));
		cp.add(new JLabel("Enter an integer:"));
		tfInput = new JTextField(10);
		cp.add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		add(new JLabel("The Accumulated Sum is: "));
		tfOutput = new JTextField(10);
		tfOutput.setEditable(false);
		cp.add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(350,120);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingAccumulator();
	}
	
	private class TFInputListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum+"");
		}
	}
}
