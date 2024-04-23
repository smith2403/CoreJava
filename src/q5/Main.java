package q5;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println(l); //add
		
		l.remove("c");
		System.out.println(l);//remove
		
		l.set(0, "f");
		System.out.println(l);//update
		
		System.out.println(l.contains("b"));//search
		
		//iterator
		Iterator iterator = l.iterator();
		while(iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
		
		//forEach
		for(Object ob:l) {
			System.out.println(ob);
		}
		
		//ListIterator
		ListIterator listIterator = l.listIterator();
		while(listIterator.hasNext()) {
			String s = (String) listIterator.next();
			System.out.println(s);
		}
		
		//Enumeration
		Vector vector = new Vector(l);
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			String s = (String) enumeration.nextElement();
			System.out.println(s);
		}
	}

}
