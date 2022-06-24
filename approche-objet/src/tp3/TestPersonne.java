package tp3;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		AdressePostale adresse = new AdressePostale(12, "rue du commerce", 34000 , "MONTPELLIER");
		
	
		
		Personne alex = new Personne("Alex","DUPONT",adresse);
		alex.afficher();
		alex.setNom("Tezst"); 
		alex.afficher();

		//System.out.println(alex.adressePostale.codePostal);
		
		//Personne michel = new Personne();
		
	}

}
