package tp3;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adressePostale;
	
	

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
	this.prenom = prenom;
		this.adressePostale = adressePostale;
		
	}
	
	void afficher(){
		System.out.println("je m'appelle "+ nom.toUpperCase() +" "+ prenom);
		
	}
	
	void setNom(String nouveau) { 
		nom =  nouveau ; 
	}
	
	String getNom() { 
		return nom ; 
	}
}
