package fr.dauphine.javaavance.td1;


public class TD1_Ex_1 {
	// 2) sa transforme "sysout" en "System.out.println()"
	/* 3) sa transforme "tostr" en : @Override
	                                 public String toString() {
	                           	     TODO();
	                                 return super.toString();
	                                 }
	      c'est à dire que ça creer une classe String
	 */
	 /* 4) sa transforme "main" en :  public static void main(String[] args) {
		
	                                  }
	      c'est à dire que ça creer la classe main
	  */
	int foo;
	//5.1) sa créer le constructor 
	/*public TD1_Ex_1() {
		TODO();
	}*/
	
	//5.2) sa creer un une classe setFoo :
	public void setFoo(int foo) {
		this.foo = foo;
	}
	
	//6.1)Alt+shift+R en selectionnant le nom de la classe permet de refactor, c'est à dire renommer la classe 
	//6.2)Alt+shift+R en selectionnant le nom de la variable "foo" permet de refactor, c'est à dire renommer la variable partout
	
}
