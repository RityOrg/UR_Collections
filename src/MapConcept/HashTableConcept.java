package MapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
//HashTable:
		/* it is similar to hashmap but it is synchronized 
		 * stores the data on the basis of key-val
		 * Key-->Object---> Hashcode--->value
		 * No Null key and null values are allowed
		 * only unique elements
		 */
		Hashtable ht= new Hashtable ();
		ht.put("1", "Tom");
		ht.put("111", "rft");
		System.out.println(ht);
	// comparing	
		Hashtable ht2= new Hashtable();
		ht2.put("1", "Tom");
		ht2.put("111", "rft");
	
// Check both the hashtables are equal or not:
		if(ht2.equals(ht)) 
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");
		
		Hashtable h1 = new Hashtable();
		h1.put("1", "Susaine");
		h1.put("2", "Harry");
		h1.put("2", "Harry"); // contains unique elements
		
//Create  a clone copy or shallow copy		
		Hashtable h2 = new Hashtable();
		h2= (Hashtable)h1.clone();
		h1.remove("2");
		System.out.println("Valuse from h1 "+h1);
		System.out.println("Valuse from h2 "+h2);
		h1.clear();
		System.out.println("Valuse from h1 "+h1);
		System.out.println("Valuse from h2 "+h2);// retains the clone copy even if the original value is deleted
		if(h2.containsValue("Harry")) 
			{
				System.out.println("value found");
			}
// Print all the values from hashtable using --Enumeration -- elements()
		Enumeration e= ht.elements();
		System.out.println("print value from ht using enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
// get all the values from hashtable using --entrySet() -- set of hashtable values:
		System.out.println("print value from ht using entrySet()");
		Set s= ht.entrySet();
		System.out.println(s);

//get the hashcode of the hashtable object:
		System.out.println("the hashcode value of ht: "+ht.hashCode());
		
//generics:
		Hashtable<String, String> ha= new Hashtable<String, String> ();
		ha.put("1", "Tom");
		ha.put("111", "rft");
		System.out.println(ha);
	}

}
