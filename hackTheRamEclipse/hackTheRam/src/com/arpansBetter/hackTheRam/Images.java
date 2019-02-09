package com.arpansBetter.hackTheRam;

import java.awt.*;
import javax.swing.JFrame;

public class Images extends JFrame {
	
	public static void main(String[] args) {
		
		DisplayMode dm = new DisplayMode(640, 480, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i = new Images();
		i.run(dm);
		
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		window.setVisible(true);
		
	}
	
	public void run(DisplayMode dm) {
		setBackground(Color.getHSBColor(50, 10, 255));
		setForeground(Color.BLACK);
		setFont(new Font("Courier", Font.PLAIN, 24));
		
		Screen s = new Screen();
		
		try {
			s.setFullScreen(dm, this);
			try {
				Thread.sleep(5000);
			} catch (Exception ex) {
				
			}
		} finally {
			s.restoreScreen();
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Kewl.", 200, 200);
	}
}