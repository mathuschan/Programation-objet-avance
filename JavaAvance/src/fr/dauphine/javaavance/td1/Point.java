package fr.dauphine.javaavance.td1;

public class Point {
	private int x;
	private int y;
	
	public Point(int px, int py){
        this.x = px;
        this.y = py;
    }

	public static void main(String[] args) {
		Point p=new Point(0, 0);
		System.out.println(p.x+" "+p.y);
	}
	public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

/* EXERCICE 3
	3.2. 
 */
	public boolean isSameAs(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
	// EXERCICE 5 
	public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
	
}