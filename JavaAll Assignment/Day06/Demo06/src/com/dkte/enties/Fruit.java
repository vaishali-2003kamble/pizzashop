package com.dkte.enties;

import java.util.Scanner;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;

	public Fruit() {
	}

	public Fruit(String name) {
		this.name = name;
		isFresh = true;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter the color - ");
		setColor(sc.next());
		System.out.print("Enter the weight - ");
		setWeight(sc.nextDouble());
	}

	public String taste() {
		return "no specific taste";
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + getColor() + ", weight=" + getWeight() + "]";
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

}
