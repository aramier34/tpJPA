package listes2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> listeEntiers = new ArrayList<>();
		listeEntiers.add(-1);
		listeEntiers.add(5);
		listeEntiers.add(7);
		listeEntiers.add(3);
		listeEntiers.add(-2);
		listeEntiers.add(4);
		listeEntiers.add(8);
		listeEntiers.add(5);
		
		for (Integer nombre : listeEntiers) {
			System.out.println(nombre);			
		}
		System.out.println("la taille de la liste est de " +listeEntiers.size());
		
		System.out.println("le max est " +Collections.max(listeEntiers));
		
		listeEntiers.remove(Collections.min(listeEntiers));
		
		for (Integer nombre : listeEntiers) {
			System.out.println(nombre);			
		}
		System.out.println("la taille de la liste est de " +listeEntiers.size());
		
		
		//System.out.println(Math.abs(listeEntiers));
	
		Iterator<Integer> iter = listeEntiers.iterator();
		while(iter.hasNext()) {
			if (listeEntiers.nombre<0) {
				nombre*-1
			}
		}
	}
	
	

}
