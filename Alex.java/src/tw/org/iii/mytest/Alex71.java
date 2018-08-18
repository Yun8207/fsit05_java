package tw.org.iii.mytest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Alex71 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
		System.out.println("-----");
		for (Integer num : set) {
			System.out.println(num); //foreach can be use on all Collection
		}
		
		
//		HashSet set = new HashSet();
//		set.add(12); //set no-sequence
//		set.add(14);
//		set.add("Alex");
//		set.add(new Bike());
//		set.add(12);
//		set.add(34);
		
		System.out.println(set.size());
		
		

	}

}
