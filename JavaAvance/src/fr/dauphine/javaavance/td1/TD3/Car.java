package fr.dauphine.javaavance.td1.TD3;

import java.util.Objects;

public class Car  {
	
	private final String brand;
	private final int value;
	@SuppressWarnings("unused")
	private final int vetuste;
	private final String licencePlate;
	public Car(String brand, String licencePlate, int value) {
		this(brand, licencePlate, value, 0);
	}
	
	public Car(String brand, String licencePlate, int value, int collection) {
		if(value < 0) throw new IllegalArgumentException("negative value");
		this.licencePlate = Objects.requireNonNull(licencePlate);
		int computedValue = value - collection*1000;
		if(computedValue*2 < value) throw new IllegalArgumentException("too old");
		this.brand = brand;
		this.value = computedValue;
		this.vetuste = collection;
	}
	
	public String getLicencePlate() {
		return licencePlate;
	}
	public String getBrand() {
		return brand;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
	return "Voiture " + getBrand() + " " + licencePlate + " " + value;
	}
	
	//Exercice 2.3
	public boolean equals(Car c) {
		return value == c.value && getBrand().equals(c.getBrand()) && c.getLicencePlate().equals(licencePlate);
		}
		
		@Override
		public boolean equals(Object obj) {
		if(!(obj instanceof Car)) return false;
		return equals((Car)obj);
		}
		
		@Override
		public int hashCode() {
		return 42;
		}



}
