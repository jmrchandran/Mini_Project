package com.sampleprograms;

//import java.util.Scanner;

public class Armstrong_Example1 {
	public static void main(String[] args) {
	//Scanner scan=new Scanner(System.in);
	//int t=scan.nextInt();
	
		int t=153;
		int a=t,b,c=0;
		while(a>0) {
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
					}
		System.out.println(c);
		if(t==c) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("non armstrong");
		}
	}

}
