package Set.HashSet;

import java.util.*;

public class Clone_set {
	public static void main(String[] args) {
		 HashSet<String> set1 = new HashSet<>();
	        set1.add("Rishi singh");
	        set1.add("Rohan");
	        set1.add("Mohan");

	        HashSet cloned_set = new HashSet(); 
	        
//	        set1.clear();
	        // Cloning the set using clone() method 
//	        cloned_set = (HashSet)set1.clone();
//	        System.out.println(cloned_set);
//	        set1.clear();
	        

//	        HashSet<String> clonedSet = (HashSet<String>)set1.clone();
//
//	        System.out.println("Original set1: " + set1);
//	        System.out.println("Cloned set: " + clonedSet);
//
//	        set1.clear();
//
//	        System.out.println("After clearing set1: " + set1);
//	        System.out.println("Cloned set remains unchanged: " + clonedSet);
	           
	        System.out.println("\n");
	        
	     // Clone using the copy constructor
	        HashSet<String> clonedSet1 = new HashSet<>(set1);

	        // Print the original and cloned sets
	        System.out.println("Original HashSet (set1): " + set1);
	        System.out.println("Cloned HashSet (clonedSet): " + clonedSet1);
	}

}
