package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		Set<Set<Integer>> powerSet = 	findpowerSet(set);
		
		System.out.println(powerSet);
	}

	

	public static Set<Set<Integer>> findpowerSet(Set<Integer> originalSet) {
		    Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
		    if (originalSet.isEmpty()) {
		    	sets.add(new HashSet<Integer>());
		    	return sets;
		    }
		    List<Integer> list = new ArrayList<Integer>(originalSet);
		    Object head =   list.get(0);
		    Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size())); 
		    for (Set<Integer> set : findpowerSet(rest)) {	
		    	Set<Integer> newSet = new HashSet<Integer>();
		    	newSet.add((Integer) head);
		    	newSet.addAll(set);
		    	sets.add(newSet);
		    	sets.add(set);
		    }		
		   
		    return sets;
		}
	
	
	

}
