package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product>{
	
	public ComparableProduct(String n, Double d) {
		super(n,d);
	}
	
	public int compareTo(Product o) {
		return getName().compareTo(o.getName());
	}
}
