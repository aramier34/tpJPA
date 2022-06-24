package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		
List <Integer> list =new ArrayList<>();
for (int i=1; list.size()<100; i++) {
		list.add(i);}

for (Integer nombre : list) {
	System.out.println(nombre);
}
System.out.println("la taille de la liste est de "+ list.size());
}


	}


