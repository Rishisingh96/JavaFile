package Set.HashSet;

import java.util.*;

public class Union_of_Set {
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

		HashSet<Integer> Union = new HashSet<>();
		Union.addAll(set);
		Union.addAll(set2);
		
		System.out.println(Union);
		Union.forEach(System.out::println);
	}
}
