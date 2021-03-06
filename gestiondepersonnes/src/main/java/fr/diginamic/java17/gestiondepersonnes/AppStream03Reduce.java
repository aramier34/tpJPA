package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import fr.diginamic.java17.gestiondepersonnes.classes.Facteur;
import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.classes.PersonneServices;
import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public class AppStream03Reduce {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		List<Personne> lp = new ArrayList<>();
		lp.add(new Facteur("Fact01", "jean", Genre.Mr, 20));
		lp.add(new Facteur("Fact02", "martine", Genre.Mme, 50));
		lp.add(new Facteur("Fact03", "pauline", Genre.Melle, 30));
		lp.add(new Facteur("Fact04", "paul", Genre.Mr, 55));
		PersonneServices.calculSommeAge(lp).ifPresentOrElse(System.out::println,
				() -> System.err.println("Aucun calcul !!"));
		
		PersonneServices.calculSommeAge(lp, PersonneServices::somme).ifPresentOrElse(System.out::println,
				() -> System.err.println("Aucun calcul !!"));

	

	public static Optional<Integer> calculSommeAge(List<Personne> maListedePersonnes, BinaryOperator<Integer> bo) {
		return maListedePersonnes.stream().map(Personne::getAge).reduce(bo);

	
		/**
		* Ecrire une m?thode retournant la moyenne des Ages
		*/
		public static Double calculeMoyenne(
		List<Personne> maListedePersonnes,
		ToDoubleFunction<? super Personne> op) {
		return maListedePersonnes.stream().
		collect(Collectors.averagingDouble(op));
		
		// ou
		//System.out.println(PersonneServices.calculeMoyenne(lp, Personne::getAge));
		
		
		/**
		* Nombre des ?ges pour ?ges >= 50 de la liste de Personne
		* Predicate (retourne un bool?en)
		* p.getAge() >= 50 : retourne true or false
		*/
		System.out.println(PersonneServices.getCumul(lp,(p)->p.getAge() >= 50));
		
		
		/**
		* Nombre des Genre.MR de la liste de Personne
		*/
		Predicate<Personne> predMr = p->p.getGenre()==Genre.Mr;
		System.out.println(PersonneServices.getCumul(lp,predMr));
		
		
		
			}
}
