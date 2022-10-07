//Java program to demonstrate working of Hashset

import java.util.*;

public class HashSet_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String>hashset= new HashSet<>();
			
			hashset.add("A");
			hashset.add("B");
			boolean r1=hashset.add("C");
//			System.out.println(r1);
			boolean r2=hashset.add("C");
//			System.out.println(r2);
			
			System.out.println(hashset);
			
			System.out.println("Set contains c or not? " + hashset.contains("C"));

			hashset.remove("A");
			System.out.println("Set after removing A:" +hashset);
			
			for (String item: hashset) {
				System.out.println(item);
			}
			
			
		}


	}

