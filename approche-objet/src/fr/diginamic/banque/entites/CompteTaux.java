package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	float taux;

	public CompteTaux(int numero, float solde, float taux) {
		super(numero, solde);
		this.taux=taux;
	}

	@Override
	public String toString() {
		return "CompteTaux [taux=" + taux + "]"+"[numero=" + numero + ", solde=" + solde + "]";
	}


	

}
