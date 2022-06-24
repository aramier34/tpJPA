package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String date;
	private float montant;
	public Operation(String date, float montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "Operation [date=" + date + ", montant=" + montant + "€, type="+getType()+"]";
	}
	
	public abstract String getType(); 
	

}
