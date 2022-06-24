package tri;

public class Ville implements Comparable<Ville>{
	
	public int compareTo(Ville autre) { 
		 return this.nbHabitants.compareTo(autre.getNbHabitants()); 
	}
	
	
	
	private String nom;
	private int nbHabitants;
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}
	
	

}
