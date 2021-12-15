package com.sampleprograms;

import java.util.Scanner;

//import java.util.Scanner;

public class Fibonacci_Example1 {
public static void main(String[] args) {
	int a=0,b=1,c;
//	Scanner scan=new Scanner(System.in);
//	int n=scan.nextInt();
	System.out.println("Please see the below Fibonacci numbers:");
		for(int i=0;i<15;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
	}

}
