package fr.dauphine.javaavance.td1;

public class TD1_EX2 {
	    // 1) sa fonctionne car x et y ont été creer avant la methode
		// 2) il y a une erreur, il faut enlever private des variables x et y dans la classe Point pour que ça fonctionne
		// 3) Permet de conserver une independance entre la classe qu'on d'eveloppe et les autres classes avec laquelle elle interagit.
		// 4) Un accesseur est une methode qui permet d’acceder indirectement en lecture ou en ecriture a un champ, les getter suffisent
		// 5) Le main avec new Point() ne compile plus. Il faut soit ajouter un second constructeur, soit modifier le main en new Point(0,0) 
		// 6) Si jamais les champs ont le meme nom qu’une variable locale ou un parametre, ça ”masque” le champs. Ainsi, dans le constructeur x = x ;
		//    Il faut donc dans ce cas, utiliser this.x = x 
		// 7) Il faut un champs static et la methode doit aussi etre static, et il faut le faire dans le constructeur et les autre methode l'appel par this.(...)
}
