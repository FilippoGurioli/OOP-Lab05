package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	
	private String name;
	private double quantity;
	
	public ProductImpl(final String s, final double d) {
		this.name = s;
		this.quantity = d;
	}
	
	public ProductImpl() {
		this.quantity = 1;
	}

	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}
	
	@Override
	public String toString() {
		return "[ " + this.getName() + ", " + this.getQuantity() + " ]";
	}
}

