package com.polyoverloading;

public class Poly_Overriding1 extends Poly_Overriding{
public void lunch3(String name) {
	System.out.println(name);
}
public void lunch4() {
	System.out.println("Lemon");
}/*
@Override
public void lunch(String name) {
super.lunch(name);
}
@Override
public void lunch1() {
	super.lunch1();
}
@Override
public void lunch2() {
	super.lunch2();
}*/
public static void main(String[] args) {
	Poly_Overriding1 PO=new Poly_Overriding1();
	PO.lunch3("Tamarind");
	PO.lunch4();
	PO.lunch1();
	PO.lunch2();
	PO.lunch("Cocunut");
	
}
}
