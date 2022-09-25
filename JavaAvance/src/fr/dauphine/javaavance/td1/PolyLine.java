package fr.dauphine.javaavance.td1;

import java.util.Objects;

public class PolyLine {
	private final Point[] points;
	private int nb=0;
	
	 public PolyLine(int maxPoints) {
	 points = new Point[maxPoints];
	 }
	
	 public void add(Point p) {
	 if(points.length <= nb) throw new IllegalStateException("full");
	 points[nb++]=Objects.requireNonNull(p);
	 }
	
	 public int pointCapacity() {
	 return points.length;
	 }
	
	 public int nbPoints() {
	 return nb;
	 }
	
	 public boolean contains(Point p) {
	 for(Point p0:points) {
	 if(p0.equals(p)) return true;
	 }
	 return false;


}
}	 
