package MapConcept;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
//TreeMap:
		/* it implements NavigableMap>>SortedMap>>Map
		 * it also contains value based on the key and only unique elements 
		 * it may have one null key and multiple null values  	
		 * it supports ascending order
		 * Can print in descending order using NavigableMap 
		 */
		TreeMap<String, String> hm = new TreeMap<String, String>();
		hm.put("400", "Selenium");
		hm.put("500", "QTP");
		hm.put("510", "Jenkins");
		hm.put("100", "Git");
		hm.put("600", "Ritika");
		hm.put("700", "Appium");
		System.out.println("In ascending Order");
		System.out.println(hm);// prints in ascending order
		System.out.println("In descending Order");
		NavigableMap<String, String>d = hm.descendingMap();
		System.out.println(d);// prints in descending order
		String val = hm.get("600");
		System.out.println("Value from HashMap is: "+val); 
		
//Retrieve all the Entry in hash map
		
		for(Map.Entry<String, String> e : hm.entrySet())
			{
				System.out.println("key from map is: "+e.getKey()+" and Value from map is: "+e.getValue());
			}	
//retrieve all the keys in the hash map
		
		for(String k : hm.keySet()) 
			{
				System.out.println(k);
			}

	}

}
