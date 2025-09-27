package com.dkte.enties;

import java.util.Scanner;

public class Apple extends Fruit {
	public Apple() {
		super("Apple");

	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}

	@Override
	public String toString() {
		return "Apple [color=" + getColor() + ", weight=" + getWeight() + ", name=" + getName() + ", isFresh=" + isFresh() + "]";
	}

	public String taste() {
		return "Sweet and sour";
	}

	@Override
	public void setFresh(boolean isFresh) {
		super.setFresh(isFresh);
	}

	@Override
	public String getName() {
		return super.getName();
	}

}
