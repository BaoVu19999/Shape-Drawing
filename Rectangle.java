package com.abc.draw.geometry;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import com.abc.draw.Drawable;

public class Rectangle implements Drawable {
	private Point upperLeft;
	private double width;
	private double height;

	public Rectangle(Point upperLeft, double width, double height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the uperLeft
	 */
	public Point getUpperLeft() {
		return upperLeft;
	}

	/**
	 * @param uperLeft the uperLeft to set
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

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		Rectangle2D rect = new Rectangle2D.Double(upperLeft.getX(), upperLeft.getY(), width, height);
		g2.draw(rect);
	}

}
