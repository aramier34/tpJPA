package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, float montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return "DEBIT";
	}

}
