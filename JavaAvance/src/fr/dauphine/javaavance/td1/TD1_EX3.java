package fr.dauphine.javaavance.td1;

public class TD1_EX3 {

	public static void main(String[] args) {
		// 1) 1er -> true : c’est la meme reference au premier objet alloue qui est stocke dans p1 et p2
		//    2e  -> false : les deux objets alloues ont des champs qui ont la meme valeur, mais ce sont deux objets differents.
		// 3) Dans notre cas, cela signifie que equals() dit vrai entre p1 et p2, et faux entre p1 et p3. En effet, l'implementation par defaut de equals est realisee avec ==.
	}

}
