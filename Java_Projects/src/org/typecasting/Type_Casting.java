package org.typecasting;

public class Type_Casting {
	public static void main(String[] args) {
//widening type casting
		int a = 100000;
		double d = a;
		System.out.println("Your Salary is: " + d);
//Narrowing type casting
		double d1 = 10345.45;
		int a1 = (int) d1;
		System.out.println("Your total fare is(rounded off) is: " + a1);

		float f = 1234.303f;
		short s = (short) f;
		System.out.println("Your weight is: " + s);
		float f1 = 12345.4567f;
		double d2 = f1;
		System.out.println("Example for float to double: " + d2);

	}

}
