package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		l.add("Litheshwar");
		l.add(01.12);
		l.add(2017);
		l.add("Litheshwar");
		System.out.println("Please find the given values is: " + l);
		int size = l.size();
		System.out.println("Size for given value is: " + size);
		Object object = l.get(0);
		System.out.println("Index found for the value is: " + object);

		// System.out.println(l.set(3, "Ramachandran"));
		l.set(3, "Ramachandran");
		System.out.println("The changed details are : " + l);
//	l.remove(3);
		// System.out.println("After removed details are: "+l);
		int indexOf = l.indexOf("Ramachandran");
		System.out.println("Index value is: " + indexOf);
		boolean contains = l.contains("Ramachandra");
		System.out.println(contains);
//   l.clear();
//   System.out.println(l);
		List<Object> l1 = new ArrayList<Object>();
		l1.add("Father Name is Ramachandran");
		l1.add(1983);
		l1.add(01.12);
		l1.add("Mother Name is RM.Kaviya");
		System.out.println("The new details are: " + l1);
		l.addAll(l1);
		System.out.println("Both details are: " + "\n" + l);
		l.retainAll(l1);
		System.out.println("\n" + l);
		l.removeAll(l1);
		System.out.println(l);

	}
}
