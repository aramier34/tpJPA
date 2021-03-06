package fr.diginamic.java17.gestiondepersonnes;

import java.util.List;
import java.util.Optional;

import fr.diginamic.java17.gestiondepersonnes.classes.Voiture;

public class VoitureService {

	public static Optional<Voiture> findByNumeroVoiture(
			List<Voiture> vs,String immatriculation){
		
		
		for(Voiture v : vs) {
			if(v.getImmatriculation().equalsIgnoreCase(immatriculation)) {
				return Optional.of(v);
			}
		}
		
		return Optional.empty();
	}
}
