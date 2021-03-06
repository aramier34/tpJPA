package fr.diginamic.java17.gestiondepersonnes.classes;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class PersonneServices {
	
	public static Optional<Personne> findByNamePersonne(
			List<Personne> lp, String nom){
		
		for(Personne p :lp) {
			if(p.getNom().equalsIgnoreCase(nom)) {
				return Optional.of(p);
			}
		}
		
		return Optional.empty();
	}
	/**
	* .reduce((ageCalculee,ageCourant)->ageCalculee+ageCourant)
	* @param cumul
	* @param valeurEnCours
	* @return le nouveau cumul
	*/
	public static Integer somme(Integer cumul,Integer valeurEnCours) {
	return cumul + valeurEnCours;
	}
	/**
	* Service pour r?cup?rer la somme par exemple ? partir
	* d'un stream d'une liste de type Personne
	*
	* return lp.stream() //Point d?pard c'est le stream() de ma liste
	.map(???) //je cible sur quoi je vais travailler
	.reduce(???);
	*
	*/
	public static Optional<Integer> calculSommeAge(List<Personne> maListedePersonnes){
	return maListedePersonnes
	.stream()
	.map(Personne::getAge)
	.reduce(PersonneServices::somme);
	//return Optional.empty();
	
	}
	/**
	* Ecrire le AppStream03Reduce qui utilise PersoneServices
	* le faire fonctionner la m?thode calculSommeAge
	*/
	
	
	
	
	/**
	* Ecrire une m?thode retournant la moyenne des Ages
	*
	*/
	public static Double calculeMoyenne(
	List<Personne> maListedePersonnes,
	ToDoubleFunction<? super Personne> op) { //op = Personne::getAge
	return maListedePersonnes.stream().//Un stream<Personne>
	collect(
	/**
	collect me permet de lancer des traitements soient de type
	ou d'agr?gats (moyenne, count ....)
	*/
	Collectors.averagingDouble(op)
	/**
	* Collectors.averagingDouble
	* je fais une moyenne(sur op) et retourne le r?sultat en Double
	* op c'est une expression lambda pass? en par?m?tre
	* ToDoubleFunction<? super Personne> op
	* Le type ToDoubleFunction<? super Personne>
	* est impos? par la m?thode averagingDouble
	* VOIR la JDK
	*/
	);}
	
	/**
	* Nombre des ?ges pour ?ges >= 50 de la liste de Personne
	* Nombre des Genre.MR de la liste de Personne
	*
	*/
	public static Long getCumul(List<Personne> maListedePersonnes,
	Predicate<? super Personne> monFiltre) {
	return maListedePersonnes.stream()
	.filter(monFiltre)
	.collect(Collectors.counting());
	
			
	}}
			
	

