package it.unibo.oop.lab05.ex4;

import java.util.Set;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WharehouseImpl;
import java.util.Comparator;
import java.util.TreeSet;

public class OrderedWarehouse extends WharehouseImpl{
	
	public Set<Product> allProducts(){
		return new TreeSet<>(super.allProducts());
	}
}
