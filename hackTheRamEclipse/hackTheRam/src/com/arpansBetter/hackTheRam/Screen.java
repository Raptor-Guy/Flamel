package com.arpansBetter.hackTheRam;

import java.awt.*;
import javax.swing.JFrame;

public class Screen extends JFrame {
	private GraphicsDevice vc;
	
	public Screen() {
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = env.getDefaultScreenDevice();
	}
	
	public void setFullScreen(DisplayMode dm, JFrame wnd) {
		wnd.setUndecorated(true);
		wnd.setResizable(false);
		vc.setFullScreenWindow(wnd);
		
		if (dm != null && vc.isDisplayChangeSupported()) {
			try {
				vc.setDisplayMode(dm);
			} catch (Exception ex) {
				
			}
		}
	}
	
	public java.awt.Window getFullScreenWindow() {
		return vc.getFullScreenWindow();
	}
	
	public void restoreScreen() {
		java.awt.Window w = vc.getFullScreenWindow();
		if (w != null) {
			w.dispose();
		}
		vc.setFullScreenWindow(null);
	}
	
}
