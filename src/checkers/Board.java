package checkers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A board to hold the contents of the game
 * 
 * @author Shely Lin
 * @version 2018
 *
 */
public class Board extends JPanel {
	
	public static final int ROWS = 8;
	public static final int COLS = 8;
	
	private static JPanel[][] tiles = new JPanel[ROWS][COLS];
	
	public Board() {
		this.setSize(700, 700);
		this.setLayout(new GridLayout(ROWS, COLS));
		populateBoard();
		this.setBackground(Color.blue);
		refreshBoard();
	}
	
	private void refreshBoard() {
		this.repaint();
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				tiles[i][j].repaint();
			}
		}
	}
	
	private void populateBoard() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				if (i % 2 == j % 2) {
					tiles[i][j] = new Tile(i, j, 60, Color.black);
				} else {
					tiles[i][j] = new Tile(i, j, 60, Color.lightGray);
				}
				this.add(tiles[i][j]);
			}
		}
	}
}
