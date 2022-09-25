package fr.dauphine.javaavance.td1;

public class TD2_EX1 {
	/* 1)42
		 42
 		 24
         24 (appel meth de fille car il a ete redefini)
 		 24 (appel sur le “vrai” type de merefille, Meme principe que le toString redefini de point...)
         24 
	 */
	
	// 2) il a acces à 2
	/* 3)
	 	— 42
		— 42
		— 24
		— 42 (appel du meth() en mode statique dans la classe)
		— 42 (appel selon le type de la variable)
		— 42
	 */
}
