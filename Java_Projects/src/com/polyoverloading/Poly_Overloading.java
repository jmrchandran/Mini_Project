package com.polyoverloading;

public class Poly_Overloading {
private void Associate(String name) {
	System.out.println(name);
}
private void Associate(int age1, int year1) {
	System.out.println(age1+","+year1);
}
private void Associate(char gender) {
		System.out.println(gender);
	}
public static void main(String[] args) {
	Poly_Overloading O=new Poly_Overloading();
	O.Associate("Durairaj J");
	O.Associate(39, 1982);
	O.Associate('M');
}
}
