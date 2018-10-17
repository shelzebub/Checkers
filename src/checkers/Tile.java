package checkers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A component which holds properties pertaining to each square on a checker board.
 * Includes colored tiles, coordinate tiles and such.
 * 
 * @author Shely Lin
 * @version 2018
 *
 */
public class Tile extends JPanel {

	private int col;
	private int row;
	private int length = 100;
	private JLabel label = new JLabel();
	
	/**
	 * Tile constructor: creates a tile with no label.
	 * 
	 * @param col refers to columns on the board
	 * @param row refers to rows on the board
	 * @param color refers to color of the Tile
	 */
	public Tile(int col, int row, Color color) {
		this.setLayout(new GridLayout());
		this.col = col;
		this.row = row;
		this.setBackground(color);
		this.setPreferredSize(new Dimension(length, length));
	}
	
	/**
	 * Tile constructor: creates a tile with a label.
	 * 
	 * @param col refers to columns on the board
	 * @param row refers to rows on the board
	 * @param color refers to color of the Tile
	 * @param coord refers to coordinate labels around the edges of the board
	 */
	public Tile(int col, int row, Color color, String coord) {
		this.setLayout(new GridLayout());
		this.col = col;
		this.row = row;
		this.setBackground(color);
		this.setPreferredSize(new Dimension(length, length));
		label.setText(coord);
		label.setHorizontalAlignment(JLabel.CENTER);
		this.add(label);		
	}
	
	/**
	 * Returns Column variable
	 * 
	 * @return col as an integer
	 */
	public int getCol() {
		return col;
	}
	
	/**
	 * Returns Row variable
	 * 
	 * @return row as an integer
	 */
	public int getRow() {
		return row;
	}
}
