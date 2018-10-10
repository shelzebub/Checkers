package checkers;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 * A tabletop GUI for a game of Checkers
 * 
 * @author Shely Lin
 * @version 2018
 *
 */
public class Start extends JFrame {
	
	// A JFrame to hold the application GUI
	//private static JFrame window = new JFrame();
	
	// Start class constructor
	public Start() {
		Board board = new Board();
		this.setSize(new Dimension(1000, 1000));
		this.setVisible(true);
		this.setTitle("Checkers");
		this.setLocationRelativeTo(null);
		this.add(board);
		
	}
	
	// A starting point for the application
	public static void main(String[] args) {
		new Start();
		
	}
}
