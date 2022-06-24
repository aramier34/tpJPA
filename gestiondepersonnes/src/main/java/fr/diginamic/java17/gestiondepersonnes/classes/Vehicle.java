package fr.diginamic.java17.gestiondepersonnes.classes;

public abstract class Vehicle {
	
	private String immatriculation;

	public Vehicle(String immatriculation) {
		super();
		this.immatriculation = immatriculation;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	@Override
	public String toString() {
		return "Vehicle [immatriculation=" + immatriculation + "]";
	}
	
	

}
