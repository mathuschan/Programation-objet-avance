package fr.dauphine.javaavance.td1.TD3;

import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Garage {

	@SuppressWarnings("unused")
	private final ArrayList<Car> list = new ArrayList<Car>();
	private final int id;
	private static int NB = 1;
	public Garage() {
		this.id = NB++;
	}
	
	public void addCar(Car car) {
		list.add(car);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("Garage id " + id);
	
		for(Car c: list) {
			sb.append(c.toString()).append("\n");
		}
	
		return sb.toString();
	}
	
	public int getValue() {
		int val = 0;
		for(Car c: list) {
			val += c.getValue();
		}
		return val;
	}
	
	public int getId() {
		return id;
	}
	
	public String firstCarByBrand(String brandd) {
		String b = brandd;
		for(Car c: list) {
			if (b.equals(c.getBrand())){
				return c.getLicencePlate();
			}
		}
		return "il n'y a pas cette marque";
		
	}
	
	public void protectionism(String brand) {
		Iterator<Vehicule> it = list.iterator();
		while(it.hasNext()) {
			Vehicule v = it.next();
			if(v.getBrand().equals(brand)) {
				it.remove();
			}
		}
	}
	
	
}
