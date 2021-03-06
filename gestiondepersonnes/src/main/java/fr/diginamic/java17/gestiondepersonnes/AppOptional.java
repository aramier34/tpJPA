package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import fr.diginamic.java17.gestiondepersonnes.classes.Facteur;
import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.classes.PersonneServices;
import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public class AppOptional {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		List<Personne> lf = new ArrayList<>();
		lf.add(new Facteur("Jolie", "Sylvie", Genre.Melle,0));
		lf.add(new Facteur("Morand", "Yassine", Genre.Mme,0));
		lf.add(new Facteur("Dutour", "Jean", Genre.Mr,0));
		
//Optional<Personne> op =
//Concat?nation ? partir de notre Objet Optional<Personne>
		PersonneServices.findByNamePersonne(lf, "jolie").ifPresent(p -> System.out.println(p.getNom()));
		
//avec else
		PersonneServices.findByNamePersonne(lf, "jolie").ifPresentOrElse(p -> System.out.println(p.getNom()),
				() -> System.out.println("Personne non trouv?e"));

		/*
		 * if(op.isEmpty()) { System.out.println("Personne non trouv?e"); }
		 * if(op.isPresent()) { System.out.println("Personne trouv?e : "+ op.get()); }
		 */
	}
}