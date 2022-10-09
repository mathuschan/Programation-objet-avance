package fr.dauphine.javaavance.td1.TD3;

import java.util.HashSet;

public class TD3_EX2 {

	public static void main(String[] args) {
		
		Car a = new Car("Audi", "41abd75", 10000);
		Car b = new Car("BMW","42abc75", 9000);
		Car c = new Car("BMW","42abc75", 9000);
		@SuppressWarnings("unused")
		Car d = a;
		
		
		/* QUESTION 1 :Les objets b et c ne referent pas au meme objet. Ce qui explique le resultat obtenu.
					   Le resultat souhaite serait d’avoir false false true false true true ... Pour ce faire, on
					   voudrait que la methode equals() dise que 2 oranges sont egales si elles ont les memes
					   champs 

		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		
		*/
		
		/* QUESTION 2 : Comme la derniere reponse est true (b et c sont egaux), on pourrait s’attendre a ce que ce soit egalement
		                trouve dans la liste... En fait, la methode indexOf(Object o) (qui renvoit la position de la premiere 
		                occurrence de l’objet au sein de la liste courante, ou -1 s’il n’a pu etre trouve) n’appelle pas notre 
		                methode equals(Orange) : int indexOf(Object o)
                        En effet, la methode indexOf utilise la methode equals(Object o)
        
        ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		 
		*/
		
		
		@SuppressWarnings("unused")
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));

	}

}
