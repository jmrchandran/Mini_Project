package com.sampleprograms;

import java.util.Scanner;

public class Palindrome_String {
public static void main(String[]args) {
	String original,reverse="";
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a string or number: ");
	original=in.nextLine();
	
	int length =original.length();
	for(int i=length-1;i>=0;i--)
		reverse =reverse+original.charAt(i);
	System.out.println(reverse);
	if(original.equals(reverse)){
//	if(original.equalsIgnoreCase(reverse)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("non palindrome");
	}
}
}
