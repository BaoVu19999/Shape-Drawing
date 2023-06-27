package com.abc.draw.geometry;

import java.awt.Graphics2D;

import com.abc.draw.Drawable;

public class Triangle implements Drawable {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public Point getP3() {
		return p3;
	}

	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		new Line(p1, p2).draw(g2);
		new Line(p2, p3).draw(g2);
		new Line(p3, p1).draw(g2);
	}

}
