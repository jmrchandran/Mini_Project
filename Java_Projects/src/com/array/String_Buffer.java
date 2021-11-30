package com.array;

public class String_Buffer {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Ramachandran");
	StringBuffer sb1=new StringBuffer("Ramachandran");
	StringBuffer append=sb.append(sb1);
	System.out.println("Memory of sb: "+System.identityHashCode(sb));
	System.out.println("Memory of sb1: "+System.identityHashCode(sb1));
	System.out.println("Append String is: "+append);
	System.out.println("Memory of append is: "+System.identityHashCode(append));
}
}
