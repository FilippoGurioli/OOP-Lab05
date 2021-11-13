package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

public class WharehouseImpl implements Warehouse{
	
	private LinkedHashSet<Product> wh;

	public void addProduct(Product p) {
		this.wh.add(p);
	}

	public Set<String> allNames() {
		Set<String> coll = new LinkedHashSet<>();
		for ( final Product p : wh) {
			coll.add(p.getName());
		}
		return coll;
	}

	public Set<Product> allProducts() {
		Set<Product> coll = wh;
		return coll;
	}

	public boolean containsProduct(Product p) {
		for(Product p2 : wh) {
			if(p2.getName().equals(p.getName())) {
				return true;
			}
		}
		return false;
	}

	public double getQuantity(String name) {
		for(Product p : wh) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return -1;
	}

}
