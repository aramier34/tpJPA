package fr.diginamic.banque.entites;

public class Compte {
	private int numero;
	private float solde;
	
	
	public Compte(int numero, float solde) {
		this.numero = numero;
		this.solde = solde;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

	
}
