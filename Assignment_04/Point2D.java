package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;

	public Point2D() {
		this(0, 0);
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDetails() {
		return ("(" + "x" + "," + "y" + ")" + "->" + "(" + getX() + "," + getY() + ")");
	}

	public Boolean isEquals(Point2D p2) {
		if ((this.x == p2.x) && (this.y == p2.y)) {
			return true;
		}
		return false;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x cordinate: ");
		setX(sc.nextInt());
		System.out.println("Enter y cordinate: ");
		setY(sc.nextInt());
	}

	public double calculateDistance(Point2D p2) {
		double distance = 0.0;
		distance = Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
		return distance;

	}

}
