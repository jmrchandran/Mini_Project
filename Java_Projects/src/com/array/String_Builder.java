package com.array;

public class String_Builder {
public static void main(String[] args) {
	StringBuilder sbd=new StringBuilder("RamachandranJ");
	StringBuilder sbd1=new StringBuilder("Ramachandran");
	System.out.println("Memory of sbd is: "+System.identityHashCode(sbd));
	System.out.println("Memory of sbd1 is: "+System.identityHashCode(sbd1));
StringBuilder apd=sbd.append(sbd1);
System.out.println("Append details are: "+apd);
System.out.println("Memory of append is: "+System.identityHashCode(apd));
}
}
