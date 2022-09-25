package fr.dauphine.javaavance.td1;

public class Main {

	public static void main(String[] args) {
		Mere mere = new Mere();
		System.out.println(mere.meth);
		mere.printMeth();
		
		
		Fille fille = new Fille();
		System.out.println(fille.meth);
		fille.printMeth();
		
		
		Mere MereFille = new Fille();
		System.out.println(MereFille.meth);
		MereFille.printMeth();
		

	}

}
