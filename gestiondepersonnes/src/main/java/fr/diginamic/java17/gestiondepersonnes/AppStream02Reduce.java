package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.diginamic.java17.gestiondepersonnes.classes.Facteur;
import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public class AppStream02Reduce {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		List<Personne> lp = new ArrayList<>();
		lp.add(new Facteur("Fact01", "jean", Genre.Mr, 20));
		lp.add(new Facteur("Fact02", "martine", Genre.Mme, 50));
		lp.add(new Facteur("Fact03", "pauline", Genre.Melle, 30));
		lp.add(new Facteur("Fact04", "paul", Genre.Mr, 55));

		
		/**
		* 1 Cumul de tous les ?ges de la liste de Personne
		* 2 Cumul des ?ges pour les Genre.MME de la liste de Personne
		* 3 Cumul des ?ges pour ?ges >= 50 de la liste de Personne
		* 4 Nombre des ?ges pour ?ges >= 50 de la liste de Personne
		* 5 Count des Genre.MR de la liste de Personne
		*/
		
		/**
		 * 1 Cumul de tous les ?ges de la liste de Personne
		 */
		
		int cumul= lp.stream().//point de d?part c'est le stream() de ma liste
				map(p->p.getAge()).//je cible sur quoi je vais travailler
				reduce((ageCalcule,ageCourant)->ageCalcule+ageCourant)
				//Traitement attendu : je mets en place l'agr?gat
				// de la formule de calcul attendu (CUMUL)
				.get();
		System.out.println(cumul);
		
		
		/**
		 * 2 Cumul des ?ges pour les Genre.MME de la liste de Personne
		 */
		int cumulMme = lp.stream() // Point d?pard c'est le stream() de ma liste
				.filter(p->p.getGenre()==Genre.Mme)//je peux faire filtre sur le genre
				.map(p -> p.getAge()) // je cible sur quoi je vais travailler
				//j'ai qu'un type Integer et non un objet de type Personne
				.reduce((ageCalculee, ageCourant) -> ageCalculee + ageCourant)
				// Traitement attendu : je mets en place l'agr?gat
				// de la formule de calcul attendu (CUMUL)
				.get();
		System.out.println(cumulMme);
		
		
		/**
		 * 3 Cumul des ?ges pour ?ges >= 50 de la liste de Personne
		 */
		int cumulPlusEq50 = lp.stream() // Point d?pard c'est le stream() de ma liste
				// ICI j'ai un objet Personne
				// .filter(p->p.getAge()>=50) OK ici aussi
				// Je peux faire filtre sur le genre
				.map(p -> p.getAge()) // je cible sur quoi je vais travailler
				.filter(age -> age >= 50) // Filtre sur age en direct par le map(..)
				// J'ai qu'un type Integer et non un objet de type Personne
				.reduce((ageCalculee, ageCourant) -> ageCalculee + ageCourant)
				// Traitement attendu : je mets en place l'agr?gat
				// de la formule de calcul attendu (CUMUL)
				.get();
		System.out.println(cumulPlusEq50);
		
		/**
		 * 4 Nombre des ?ges pour ?ges >= 50 de la liste de Personne
		 */
		long nombrePlusEq50 = lp.stream() // Point d?pard c'est le stream() de ma liste
				.filter(p -> p.getAge() >= 50).count();
		System.out.println(nombrePlusEq50);
		
		
		// 5 Count des Genre.MR de la liste de Personne
		long nombreMr = lp.stream() // Point d?pard c'est le stream() de ma liste
				// ICI j'ai un objet Personne
				.filter(p -> p.getGenre() == Genre.Mr).count();
		System.out.println(nombreMr);
		
		long nombreMrCollect = lp.stream() // Point d?pard c'est le stream() de ma liste
				// ICI j'ai un objet Personne
				// .filter(p->p.getGenre()==Genre.MR)
				.collect(Collectors.counting());
		System.out.println(nombreMrCollect);
		
		
		double moyenneAgeCollect = lp.stream().
				collect(Collectors.averagingDouble(Personne::getAge));//p->p.getAge()
				System.out.println(moyenneAgeCollect);

	}
}