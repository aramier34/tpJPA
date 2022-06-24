package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import fr.diginamic.java17.gestiondepersonnes.classes.Facteur;
import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.classes.Vehicle;
import fr.diginamic.java17.gestiondepersonnes.classes.Voiture;
import fr.diginamic.java17.gestiondepersonnes.classes.VoiturePoste;
import fr.diginamic.java17.gestiondepersonnes.enums.Genre;
import fr.diginamic.java17.gestiondepersonnes.interfaces.Ifacteur;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * on va g�rer des personnes et des v�hicules
		 * on va cr�er des Facteurs et des Voitures pour la Poste
		 * On va g�rer ces cr�ations dans des Listes
		 * On va les trier, les filtrer...
		 * JDK1.8 => JDK 17 
		 */
		
		Personne p1 = new Facteur(new String(), new String(),Genre.Mr,0);
		Facteur f1 = new Facteur("Martin","MArtine", Genre.Mme,0);
		Facteur f2 = new Facteur("Dupont","Annick", Genre.Mme,0);
		Facteur f3 = new Facteur("Germain","Christophe", Genre.Mr,0);
		Object o1= new Facteur("Martin","MArtine", Genre.Mme,0);
		
		Vehicle v1= new VoiturePoste("102-256-58");
		Voiture vt1 = new VoiturePoste("102-256-58");
		VoiturePoste vp1= new VoiturePoste("102-256-58");
		Ifacteur ivp1= new VoiturePoste("102-256-58");
		
		List<Personne> lp = new ArrayList<>();
		List<Facteur> lf = new ArrayList<>();
		List<Object> lo = new ArrayList<>();
		List<Ifacteur> ilf = new ArrayList<>();
		
		/**
		 * Add? dans ilf 3 possibilit�s par rapport aux d�clarations de type de nos variables
		 */
		
		ilf.add(f1);
		ilf.add(ivp1);
		ilf.add(vp1);
		
		ilf.forEach(i->i.trier());
		
		/**
		 * ajouter des facteurs dans lf
		 * et je vais afficher uniquement que le genre.Mme
		 */
		
		lf.add(f1);
		lf.add(f2);
		lf.add(f3);
		/**
		 * on utilise le roreach classqiue de java 1.5
		 */
		
		/**for(Facteur f : lf) {
			if(f.getGenre() ==Genre.Mme) {
				System.out.println(f);
				
			}
		}
		for (Facteur f : lf) {
			switch (f.getGenre()) {
			case Mme:
				System.out.println(f);
				break;
				
				default:
					break;
			}
			
		}*/
		
		Predicate<Facteur> pfmme = f->f.getGenre()==Genre.Mme;
        Predicate<Facteur> pfmr = f->f.getGenre()==Genre.Mr;
		
		lf.stream().filter(pfmme).forEach(f->System.out.println(f));
		lf.stream().filter(pfmr).forEach(f->System.out.println(f));
		
		/**
		* Une liste d'objets
		*/
		lo.add(v1);
		lo.add(vp1);
		lo.add(vt1);
		lo.add(ivp1);
		
		lo.add(o1);
		lo.add(f1);
		lo.add(p1);
		lo.add(new String());
		lo.forEach(o->System.out.println(o));
		//Lambda expression avec le stream()
		
		
		
	}

}
