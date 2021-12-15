package com.sampleprograms;

public class Reverse_String {
public static void main(String[] args) {
	String a="India";
	String r="";
	int l=a.length();
	for(int i=l-1;i>=0;i--) 
		r=r+a.charAt(i);
	System.out.println("The reverse string as below: "+r);
	
	
}
}
