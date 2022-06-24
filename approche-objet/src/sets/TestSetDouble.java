package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		System.out.println(set);
		double maxDouble = Double.MIN_VALUE;
		//System.out.println(Long.MIN_VALUE);
		for (Double double1 : set) {
			if (double1 > maxDouble) {
				maxDouble = double1;
			}
		}
		
		System.out.println(maxDouble);
		double minDouble = Double.MAX_VALUE;
		for (Double double1 : set) {
			if (double1 < minDouble) {
				minDouble = double1;}}
				
		
			set.remove(minDouble);
			System.out.println(set);
		}}
	
