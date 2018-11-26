package MapConcept;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
//LinkedHashMap:
		/* it implements HashMap>>Map
		 * it also contains value based on the key and only unique elements 
		 * it may have one null key and multiple null values  	
		 * it stores value in insertion order 
		 */
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("400", "Selenium");
		hm.put("500", "QTP");
		hm.put("510", "Jenkins");
		hm.put("100", "Git");
		hm.put("600", "Ritika");
		hm.put("700", "Appium");
		hm.put("700", "Appium");
		System.out.println(hm);// maintaining insertion order
		String val = hm.get("600");
		System.out.println("Value from HashMap is: "+val); 
		
	//Retrieve all the Entry in hash map
		
		for(Map.Entry<String, String> e : hm.entrySet())
			{
				System.out.println("key from map is: "+e.getKey()+" and Value from map is: "+e.getValue());
			}	

	}

}
