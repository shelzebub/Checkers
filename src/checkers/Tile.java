package checkers;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * 
 * @author Shely Lin
 * @version 2018
 *
 */
public class Tile extends JPanel {

	private int length;
	private Color color;
	private int x;
	private int y;
	
	
	public Tile(int x, int y, int length, Color color) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.color = color;
		this.setBackground(color);
		this.setPreferredSize(new Dimension(length, length));
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
