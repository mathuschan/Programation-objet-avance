package fr.dauphine.javaavance.td1.TD3;

public class TD3_EX4 {
	/*
	1. Faux car test de reference si non redefini.
	2. Non, le equals test case i avec case i, si ordre d’insertion different foutu.
	3. Il faut redefinir compareTo. Celui d’un Car va appeler celui de vehicule si c’est pas
	un Car puis comparer selon TOUS les champs (brand, value, discount, vetuste, etc)
	dans l’ordre pour que l’ordre d’insertion ne soit pas trompeur. Pareil pour Bike. Et ¸ca
	remonte a Vehicule pour comparer entre vehicules differents
	*/

}
