package tp3entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adressePostale;
	
	

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
	this.prenom = prenom;
		this.adressePostale = adressePostale;}
		
		public void afficherPersonne() {
			System.out.println(this.nom.toUpperCase() +" " + this.prenom);
		}
		public void setNom(String nom) {
			this.nom=nom;
		}
		public String getNom() {
			
		}
	}

