package com.dkte;

public class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "(" + x + "," + y + ")";
	}

	public boolean isEquale(Point2D p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}

	public double calculateDistance(Point2D p) {
		double distance = 0;
		distance = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
		return distance;
	}
}
