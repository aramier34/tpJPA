package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {

		
		
		HashMap<String, Integer> map = new HashMap<>();
		// association d'une clé à chaque élément
		map.put("paul", 1750);
		map.put("hicham", 1825);
		map.put("yu", 2250);
		map.put("ingrid", 2015);
		map.put("chantal", 2418);
	
		System.out.println(map.size());
	}
	
	}
