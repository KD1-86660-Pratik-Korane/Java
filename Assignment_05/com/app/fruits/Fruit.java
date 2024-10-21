package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	private String name;
	String color;
	double weight;
	private boolean isFresh = true;

	public Fruit() {

	}

	public Fruit(String name, String color, double weight, boolean isFresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String taste();

	public void accept(Scanner sc) {
		System.out.println("Enter color : ");
		color = sc.next();
		System.out.println("Enter weight : ");
		weight = sc.nextDouble();
		setFresh(true);
	}

	public void display() {
		System.out.println("name : " + name);
		System.out.println("color : " + color);
		System.out.println("weight : " + weight);
		System.out.println("isFresh : " + isFresh);
	}

	public boolean isEquals() {

		return true;
	}

	public String toString() {
		return ("name : " + getName() + " color : " + getColor() + " weight : " + getWeight());
	}

}
