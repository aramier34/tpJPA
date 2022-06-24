package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("le");
		list.add("petit");
		list.add("chat");
		
		for (String string : list) {
			System.out.println(string);
			
		
		}
		System.out.println("la taille de la liste est de "+ list.size());
	}
	
	
}
