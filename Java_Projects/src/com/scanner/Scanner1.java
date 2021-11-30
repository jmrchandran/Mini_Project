package com.scanner;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter Your Full name:");
		String nextLine = myScan.nextLine();
		System.out.println("Your name is : " +nextLine);
		System.out.println("Enter Your Last Name:");
		String next = myScan.next();
		System.out.println("Your initial is: " +next);
		System.out.println("Enter your age: ");
		byte nextByte = myScan.nextByte();
		System.out.println("Your Age is: "+nextByte);
		System.out.println("Enter your year of Birth: ");
		short nextShort = myScan.nextShort();
		System.out.println("Your Year of Birth is: " +nextShort);
		System.out.println("Enter any number: ");
		byte nextByte1 = myScan.nextByte();
		System.out.println(nextByte1);
		System.out.println("Enter Your mobile number: ");
		long nextLong = myScan.nextLong();
		System.out.println("Your Mobile Number: " +nextLong);
		System.out.println("Enter Your Monthly Salary: ");
		double nextDouble = myScan.nextDouble();
		System.out.println("My Month Salary is: " +nextDouble);
		System.out.println("enter your gender: ");
		char charAt = myScan.next().charAt(0);
		System.out.println("Your Gender is: " +charAt);

//		myScan.close();

	}
}
