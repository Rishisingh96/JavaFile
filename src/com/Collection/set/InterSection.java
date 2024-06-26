package Set.HashSet;

import java.util.*;
public class InterSection {
	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		set.add(42);
		set.add(11);
		set.add(10);
		set.add(30);
		set.add(60);

		HashSet<Integer> set2 = new HashSet<>();
		set2.add(42);
		set2.add(11);
		set2.add(80);
		set2.add(30);
		set2.add(50);

		HashSet<Integer> Intersection = new HashSet<>();
		Intersection.addAll(set);
	//	Intersection.addAll(set2);
		
		Intersection.retainAll(set2);
		
		System.out.println(Intersection);
	}
}
