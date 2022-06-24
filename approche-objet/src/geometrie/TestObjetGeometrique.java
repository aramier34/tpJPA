package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		

	

	ObjetGeometrique[] formes = new ObjetGeometrique[2];
	Cercle cercle1 = new  Cercle(2);
	formes[0] = cercle1;
	formes[1] = new Rectangle(2F,3F);
	cercle1.rayon =4;
	
	for(ObjetGeometrique forme : formes) {
		System.out.println(forme.toString());
	}
	
}
}