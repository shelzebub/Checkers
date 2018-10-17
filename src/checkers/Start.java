package checkers;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * A Table-top GUI for a game of Checkers.
 * 
 * @author Shely Lin
 * @version 2018
 *
 */
public class Start extends JFrame {
	
	/**
	 *  Start class constructor.
	 */
	public Start() {
		Board board = new Board();
		this.setSize(new Dimension(1000, 1000));
		this.setVisible(true);
		this.setTitle("Checkers");
		this.setLocationRelativeTo(null);
		this.add(board);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * A starting point for the application.
	 * 
	 * @param args as an array of String objects
	 */
	public static void main(String[] args) {
		new Start();
	}
}
