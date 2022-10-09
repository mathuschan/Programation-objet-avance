package fr.dauphine.javaavance.td1.TD3;

public abstract class Vehicule {
	
	private Discount d;
	private final String brand;
	
	public abstract int getValue();
	
	public Vehicule(String brand, Discount d) {
		this.brand = brand;
		this.d = d;
	}
	public Vehicule(String brand) {
		this(brand, null);
	}
	
	public int getRealValue() {
		if(d==null) {
			return getValue();
		}
		return d.getVal();
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setDiscount(Discount d) {
		this.d = d;
	}

}
