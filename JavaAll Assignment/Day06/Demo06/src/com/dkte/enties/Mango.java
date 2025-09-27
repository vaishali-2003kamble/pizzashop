package com.dkte.enties;

import java.util.Scanner;

public class Mango extends Fruit {
	public Mango() {
		super("Mango");
		
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}
	
	@Override
	public String toString() {
		return "Mango [color=" + getColor() + ", weight=" + getWeight() + ", name=" + getName() + ", isFresh=" + isFresh() + "]";
	}
	 
	public String taste() {
		return "Sweet";
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
