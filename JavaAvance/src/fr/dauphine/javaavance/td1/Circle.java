package fr.dauphine.javaavance.td1;

public class Circle {
		 private final Point center;
		 private final double r;
		private Point p;
		
		 public Circle(Point p, double r) {
		 
		 this.p = p;
		 this.r = r;
		 }
		
		
		 public Circle translate(double dx, double dy) {
		 return new Circle(center.translate(dx, dy), r);
		 }
		
		 @Override
		 public String toString() {
		 return center.toString() + " " + r + " " + surface();
		 }
		
		 public Point getCenter() {
		 
		 return p;
		 }
		
		 @Override
		 public boolean equals(Object obj) {
		 if(obj==this)return true;
		 if(!(obj instanceof Circle)) return false;
		 Circle c = (Circle)obj;
		 return c.center.equals(center) && r==c.r;
		 }
		
		 public double surface() {
		 
		 return Math.PI*r*r;
		 }
		
		 private double squareDistance(Point p) {
		 double dx = p.getX() - center.getX();
		 double dy = p.getY() - center.getY();
		
		 return dx * dx + dy * dy;
		 }
		
		 public boolean contains(Point p) {
		
		 return squareDistance(p) <= r*r;
		 }
		
		 @Override
		public int hashCode() {
			return super.hashCode();
		}


		public static boolean contains(Point p, Circle...circles) {
		 for(Circle c: circles) {
		 if(c.contains(p))return true;
		 }
		 return false;
		 }
}
