package com.arpansBetter.hackTheRam;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class Window extends JFrame {
	static String title = "Window";
	static String mainText = "TEXT.........";
	
	private JLabel item1;
	
	public Window() {
		super(title);
		setLayout(new FlowLayout());
		item1 = new JLabel(mainText);
		item1.setToolTipText("That's some text.");
		add(item1);
	}
}