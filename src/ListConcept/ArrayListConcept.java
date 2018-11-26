package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static <E> void main (String[] args) {  
		int a[]= new int[3]; // static array--> size is fixed 
		
		// Dyanamic array ----> array list
		//1. Can contain duplicate values
		//2. Maintains insertions order
		//3. Synchronized
		//4. It allows random access to fetch the element because it stores the value on the basis of indexes
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());//size of array list 	
		
		ar.add(40);
		ar.add(10);
		System.out.println(ar.size());// it prints size as 4, duplicacy is allowed
		System.out.println(ar.get(4)); // to get the value from an index
		
// to print all the values from arraylist : 
		//1. for loop 
		//2. iterator
		for(int i=0; i<ar.size();i++) 
			{
			System.out.println("Array Value of "+i+" is "+ar.get(i));
			}
		System.out.println("************");
		
//Non Generics vs Generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(123); // values are not allowed other than integer
		ar1.add(45);
		ar1.add(01);
		
		ArrayList<E> ar2 = new ArrayList<E>(); // if not sure about the type of element in arraylist object 
		
//Employee class object:
		ArrayList<Employee> ae = new ArrayList<Employee>();
		Employee ep1 = new Employee("Riti", 27, "QA");
		Employee ep2 = new Employee("Utki", 24, "Dev");
		Employee ep3 = new Employee("UR", 29, "CEO");
		
//create array list:		
		ae.add(ep1);
		ae.add(ep2);
		ae.add(ep3);

//iterator to traverse the value:
		Iterator<Employee> it = ae.iterator();
		while(it.hasNext()) 
			{
			Employee value = it.next();
			System.out.println("Employee name is "+value.name);
			System.out.println("Employee age is "+value.age);
			System.out.println("Employee post is "+value.post);
			System.out.println("\n");
			}
		System.out.println("*************");
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("123"); 
		ar3.add("45");
		ar3.add("01");
		
		ArrayList<String> ar4 =new ArrayList<String>();
		ar4.add("01");
		ar4.add("QTP");
		ar4.add("17.00");
		ar4.add("123");

//addAll():
		ar3.addAll(ar4);
		for(int i=0; i<ar3.size();i++) 
			{
			System.out.println("After adding values are: "+ar3.get(i));
			}
		System.out.println("*************");
//removeAll():
		ar3.removeAll(ar4);
		for(int i=0; i<ar3.size();i++) 
			{
			System.out.println("After Removing values are: "+ar3.get(i));
			}
		System.out.println("*************");
// retainAll():	
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("123"); // values are not allowed other than integer
		ar5.add("QTP");
		ar5.add("43");
		
		ArrayList<String> ar6 =new ArrayList<String>();
		ar6.add("01");
		ar6.add("QTP");
		ar6.add("17.00");
		ar6.add("123");
		
		ar5.retainAll(ar6);
		for(int i=0; i<ar5.size();i++) 
			{
			System.out.println("Retained Value are: "+ar5.get(i));
			}
	}
}