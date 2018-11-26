package SetConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetConcept {
	/*Set does not allow duplicate values
	Set is unordered collection
	Can't be accessed using index */
	
//HashSet
	/* Hashset stores the element using mechanism known as hashing.it means it cant be accessed using indexes 
	 * 	hashset contains unique elements only
	 */
	
	public static void main(String [] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Selenium");
		hs.add("QTP");
		hs.add("Winium");
		hs.add("1");
		hs.add("abc");
		System.out.println("Values in hashset "+hs);
		System.out.println("\n");
		
//using advance for loop
		System.out.println("Using Advance for loop");
		for(String h: hs) 
		{
			System.out.println(h);
		}
		
//Convert Set into List
		//List<String> list = new ArrayList<String>(set);	
		List<String> ls = new ArrayList<String>(hs);
		System.out.println("Value at the Position is: "+ls.get(4));
	}
}
