package checkers;

import java.awt.Color;
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
	
	public static final int ROWS = 10;
	public static final int COLS = 10;
	
	// Back-end
	//private static JPanel[][] tiles = new JPanel[ROWS][COLS];
	
	// the Board itself is the GUI holder so "this" keyword for front-end
	
	/*
	 * Create a new chess board
	 */
	public Board() {
		this.setLayout(new GridLayout(ROWS, COLS));
		populateBoard();		
	}
	
	private void populateBoard() {	
		char top = 'a';
		char bot = 'a';
		
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				if (i == 0 | i == 9) {
					if(j == 0 | j == 9) {
						this.add(new Tile(i, j, Color.white));
					} else {
						if (i == 0) {
							this.add(new Tile(i, j, Color.white, Character.toString(top)));
							top++;	
							
						} else if (i == 9) {
							this.add(new Tile(i, j, Color.white, Character.toString(bot)));
							bot++;
						}
					}
										
				} else if (j == 0 | j == 9) {
					this.add(new Tile(i, j, Color.white, Integer.toString(9-i)));
					
				} else if (i % 2 == j % 2) {
					this.add(new Tile(i, j, Color.black));
					//tiles[i][j] = new Tile(i, j, Color.black);
					
				} else {
					this.add(new Tile(i, j, Color.lightGray));
					//tiles[i][j] = new Tile(i, j, Color.lightGray);
				}
			}
		}
	}
}
