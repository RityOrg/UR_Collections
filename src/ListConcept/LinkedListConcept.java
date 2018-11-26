package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList();
//add():
		l.add("test");
		l.add("QTP");
		l.add("Selenium");
		l.add("RPA");
		l.add("RFT");
//Print:		
		System.out.println("Concept of Linked List "+l);
//addFirst:
		l.addFirst("Riti");
//addLast:
		l.addLast("QA");
		System.out.println("Concept of Linked List "+l);
//get() value:
		System.out.println("Value: " +l.get(0));
//set() value:
		l.set(1, "Riti"); // duplicate values are allowed in Linked list
		System.out.println("Concept of Linked List "+l);
// remove first and last element
		l.removeFirst();
		l.removeLast();
		System.out.println("Concept of Linked List "+l);
		l.remove(1);
		System.out.println("Concept of Linked List "+l);
//how to print all the values of linked list:
		//1.for loop
		System.out.println("********Using for loop*******");
		for(int i = 0; i<l.size(); i++) 
			{
				System.out.println("linked list values are: "+l.get(i));
			}
		System.out.println("\n");
		//2.advance for loop
		System.out.println("********Advance for loop*******");
		for(String s: l) 
			{
				System.out.println("linked list values are: "+s);
			}
		System.out.println("\n");
		//3.iterator
		System.out.println("********Using iterator*******");
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			String val= it.next();
			System.out.println("linked list values are: "+val);
		}
		System.out.println("\n");
		//4.while loop
		System.out.println("********Using While loop*******");
		int i=0;
		while(i<l.size())
			{
				System.out.println("linked list values are: "+l.get(i));
				i++;
			}
		System.out.println("\n");
	}

}
