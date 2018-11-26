package SetConcept;

import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
//LinkedHashSet
		/* Similar to hash set but it maintains insertion order	
		 * 
		 */
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("Selenium");
		lh.add("QTP");
		lh.add("Winium");
		lh.add("1");
		lh.add("abc");
		System.out.println("Values in hashset "+lh);
		System.out.println("\n");
		
//using advance for loop
		System.out.println("Using Advance for loop");
		for(String h: lh) 
			{
				System.out.println(h);
			}		
	}

}
