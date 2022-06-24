package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, float montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return "CREDIT";
	}
	
	public void methodeSpecifiqueCredit() {
		
	}

}
