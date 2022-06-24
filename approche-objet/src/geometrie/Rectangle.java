package geometrie;

public class Rectangle implements ObjetGeometrique{

	float longueur;
	
	float largeur;
	
	
	public Rectangle(float longueur, float largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		
		return 2*longueur+2*largeur;
	}

	@Override
	public double surface() {
		
		return longueur*largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", perimetre()=" + perimetre()
				+ ", surface()=" + surface() + "]";
	}
	
	
	
	

}
