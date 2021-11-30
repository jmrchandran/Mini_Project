package com.sampleprograms;

//import java.util.Scanner;

public class Palindrome_Example1 {
public static void main(String[] args) {
//	System.out.println("Enter a number");
//	Scanner scan=new Scanner(System.in);
//	int n=scan.nextInt();
//	
	int n=151;
	int a=n, b,c=0;
	while(a>0) {
		b=a%10;
		c=(c*10)+b;
		a=a/10;
			}
	System.out.println(c);
	if (n==c) {
		System.out.println("This is Palindrome");
	}
	else
	{
		System.out.println("This is Non Palindrome");
	}
}
}
