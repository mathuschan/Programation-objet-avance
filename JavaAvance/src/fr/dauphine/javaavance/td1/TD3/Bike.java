package fr.dauphine.javaavance.td1.TD3;

public class Bike extends Vehicule {
	
	public Bike(String brand) {
		this(brand, null);
		}
		
	public Bike(String brand, Discount d) {
		super(brand, d);
	}
		
	@Override
	public int getValue() {
		return 100;
	}

}
