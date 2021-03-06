package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.diginamic.java17.gestiondepersonnes.classes.Facteur;
import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public class AppStream01Collect {

	public static void main(String[] args) {

		List<Personne> lp = new ArrayList();
		lp.add(new Facteur("Fact01", "Jean", Genre.Mr,0));
		lp.add(new Facteur("Fact02", "martine", Genre.Mme,0));
		lp.add(new Facteur("Fact03", "pauline", Genre.Melle,0));
		lp.add(new Facteur("Fact04", "paul", Genre.Mr,0));

		/**
		 * 1 r?cup?rer la liste des noms de facteurs 2 r?cup?rer les noms des facteurs
		 * dans une chaine (sans s?parateur explicite) 3 r?cup?rer les noms des facteurs
		 * dans une chaine (avec ;)
		 */

//1

		/**
		 * List<String> lnoms c'est le r?sultat attendu -> IMPOSER EN STREAM ? :
		 * lp.stream() noms des Facteurs : map(p->p.getNom()) -> mettre en m?moire de ma
		 * liste : List<Personne> => uniquement le nom du Facteur Collect : Traitement
		 * qui me retourne un flux d'information correspondant au type attendu en
		 * r?sultat List<String> collect(Collectors.toList()) Collectors.toList() :
		 * c'est le type de List du contenu d?pendant du map. C'est pour cela que
		 * j'obtiens une liste de String
		 */
		List<String> lnoms = lp.stream().map(p -> p.getNom()).collect(Collectors.toList());

//AVANT
		List<String> lnomsV0 = new ArrayList<String>();
		for (Personne p : lp) {
			lnomsV0.add(p.getNom());
		}

		/**
		 * forEach(System.out::println) Je d?pend du type de Lambda Expression de la
		 * m?thode () -> forEach(s-> avec la variable)
		 *
		 * forEach(System.out::println) lnoms est une List<String> donc s est un string
		 * forEach(s -> System.out.println(s)) On appelle de fa?on "statique" la m?thode
		 * println de System.out System.out::println : c'est une synthase "alias" Java
		 * fait un callback = il traduit en Lambda Expression selon la d?finition de la
		 * m?thode de la classe avec le ou les param?tres attendues par cette m?thode et
		 * aussi de l'appelant : forEach
		 *
		 */
		lnoms.forEach(System.out::println);

		/**
		 * 2 R?cuperer les noms des Facteurs dans une cha?ne (sans s?parateur explicite)
		 */

		String nomsDesPersonnes = lp.stream().map(p -> p.getNom()).
				collect(Collectors.joining());
		// Une concat?nation les noms dans un String

		System.out.println(nomsDesPersonnes);

		/**
		 * 3 R?cuperer les noms des Facteurs dans une cha?ne (avec un s?parateur ;)
		 */
		String nomsDesPersonnesSep = lp.stream().map(p -> p.getNom()).
				collect(Collectors.joining(";"));
		// Une concat?nation les noms dans un String
		System.out.println(nomsDesPersonnesSep);
	}

}
