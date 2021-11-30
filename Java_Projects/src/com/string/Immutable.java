package com.string;

public class Immutable {
public static void main(String[] args) {
	String a="Litheshwar";
	String b="Ramachandran";
	int identityHashCode=System.identityHashCode(a);
	System.out.println("Memory of a is: "+identityHashCode);
	System.out.println("Member of b is: "+System.identityHashCode(b));
String concat=a.concat(b);
System.out.println("Concat string is: "+concat);
System.out.println("Memory of concat is: "+System.identityHashCode(concat));
}

}
