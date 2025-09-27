package com.dkte.enties;

import java.util.Scanner;

public class Orange extends Fruit {
	public Orange() {
		super("Orange");
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}

	@Override
	public String toString() {
		return "Orange [color=" + getColor() + ", weight=" + getWeight() + ", name=" + getName() + ", isFresh=" + isFresh() + "]";
	}
	
	public String taste() {
		return "sour";
	}
	@Override
	public void setFresh(boolean isFresh) {
		super.setFresh(isFresh);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
}
