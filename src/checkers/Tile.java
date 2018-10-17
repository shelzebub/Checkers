package checkers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



/**
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
	
	public Tile(int col, int row, Color color) {
		this.setLayout(new GridLayout());
		this.col = col;
		this.row = row;
		this.setBackground(color);
		this.setPreferredSize(new Dimension(length, length));
	}
	
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
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
}
