package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.classes.PersonneServices;
import fr.diginamic.java17.gestiondepersonnes.classes.Vehicle;
import fr.diginamic.java17.gestiondepersonnes.classes.Voiture;
import fr.diginamic.java17.gestiondepersonnes.classes.VoiturePoste;

public class AppOptionalVoiture {

	public static void main(String[] args) {

		List<Voiture> vs = new ArrayList<>();
		vs.add(new VoiturePoste("az-258-ze"));
		vs.add(new VoiturePoste("bc-369-ed"));
		vs.add(new VoiturePoste("az-147-fd"));
		vs.add(new VoiturePoste("df-425-de"));
		vs.add(new VoiturePoste("ol-789-mo"));

		Optional<Voiture> ov =
				VoitureService.findByNumeroVoiture(vs,"az-147-fd");
		if(ov.isEmpty()) { 
			System.out.println("Voiture non trouv?e");
		}
		if(ov.isPresent()) {
			System.out.println("voiture trouv?e : "+ ov.get());
		}	
		
		
	}

}
