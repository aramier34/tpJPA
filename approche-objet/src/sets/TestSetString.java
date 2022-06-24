package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> set1 = new HashSet<>();
		set1.add("USA");
		set1.add("France");
		set1.add("Allemagne");
		set1.add("UK");
		set1.add("Italie");
		set1.add("Japon");
		set1.add("Chine");
		set1.add("Russie");
		set1.add("INde");
	
		String maxPays = String.MIN_VALUE;
		//System.out.println(Long.MIN_VALUE);
		for (String string1 : set1) {
			if (string1 > maxPays) {
				maxPays = string1;
			}
		}
		
		
	}

}
