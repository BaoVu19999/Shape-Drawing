package com.abc.draw.geometry;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import com.abc.draw.Drawable;

public class Square implements Drawable {
	private Point upperLeft;
	private double width;

	public Square(Point upperLeft, double width, double width2) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.width = width2;

	}

	/**
	 * @return the upperLeft
	 */
	public Point getUpperLeft() {
		return upperLeft;
	}

	/**
	 * @param upperLeft the upperLeft to set
	 */
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		Rectangle2D squ = new Rectangle2D.Double(upperLeft.getX(), upperLeft.getY(), width, width);
		g2.draw(squ);
	}

}
