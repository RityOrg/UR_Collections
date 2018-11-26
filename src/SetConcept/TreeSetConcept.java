package SetConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
//TreeSet
		/*Maintains ascending order
		 * 
		 */
		TreeSet<String> lh = new TreeSet<String>();
		Set<String> s = new TreeSet<String>();
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
		System.out.println("\n");

//Convert Set into List
		//List<String> list = new ArrayList<String>(set);	
		List<String> ls = new ArrayList<String>(lh);
		System.out.println("Value at the Position is: "+ls.get(4));
		
	}

}
