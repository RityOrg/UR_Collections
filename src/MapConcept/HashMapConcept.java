package MapConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import MapConcept.Employee;

public class HashMapConcept {
	public static void main(String[] args) {
//Map:	
	  /*Map contains key and value pair 
		each key and value pair is called as Entry
		map contains only unique keys 
		map is easy to use if you have to search and update or delete elements on the basis of keys 
		example: students are searched on the basis of their roll no
		fetch customer details from DB based on their customer id and so on..*/
	
//HashMap:
	/* it implements Map
	 * it also contains value based on the key and only unique elements 
	 * it may have one null key and multiple null values  	
	 * it does not store value in insertion order 
	 * it is non synchronized--> not thread Safe (Multiple threads attacking at the same time or concurrently, giving 
	 * fail fast condition---> ConcurrentFailException
	 */
	HashMap<String, String> hm = new HashMap<String, String>();
	hm.put("400", "Selenium");
	hm.put("500", "QTP");
	hm.put("510", "Jenkins");
	hm.put("100", "Git");
	hm.put("600", "Ritika");
	hm.put("700", "Appium");
	hm.put(null, null); //may have one null key
	hm.put("4", null); //multiple null values 
	hm.put("83", null);//multiple null values 
	hm.put("83", null); // duplicates not allowed
	System.out.println(hm);// not maintaining order
	String val = hm.get("600");
	System.out.println("Value from HashMap is: "+val); 
	
//Retrieve all the Entry in hash map
	
	for(Entry<String, String> e : hm.entrySet())
		{
			System.out.println("key from map is: "+e.getKey()+" and Value from map is: "+e.getValue());
		}	
// Class Object as a value (multiple)	
	System.out.println("\n");
	System.out.println("Class Object as a value (multiple)");
	HashMap<Integer, Employee> emp= new HashMap<Integer, Employee>();
	Employee e1 = new Employee("Tom", 27, "admin");
	Employee e2 = new Employee("Peter", 27, "QA");
	Employee e3 = new Employee("Steive", 27, "Dev");
	Employee x3 = new Employee("Steive", 27, "Dev");// duplicate values are not allowed
	Employee e4 = new Employee(null, 45, null); //multiple null values
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	emp.put(3, x3);
	emp.put(null, e4);// null key
//Traverse HashMap
	
	for(Entry<Integer, Employee> ef : emp.entrySet())
	{
		Employee v = ef.getValue();
		
		System.out.println("key from map is: "+ef.getKey()+" and Value from map is: "+v.name+", "+v.age+", "+v.post);
	}		
}
}