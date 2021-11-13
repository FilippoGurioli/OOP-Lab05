package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;

public class WharehouseImpl implements Warehouse{
	
	private LinkedHashSet<Product> wh;

	public WharehouseImpl() {
		wh = new LinkedHashSet<Product>();
	}
	
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

	@Override
	public int hashCode() {
		return Objects.hash(wh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WharehouseImpl other = (WharehouseImpl) obj;
		return Objects.equals(wh, other.wh);
	}
	

}
