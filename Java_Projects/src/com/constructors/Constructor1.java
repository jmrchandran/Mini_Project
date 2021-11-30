package com.constructors;

public class Constructor1 {
public Constructor1() {
	System.out.println("Example of constructor");
}
public Constructor1(String name) {

	System.out.println(name);
}
public Constructor1(int number1,int number2) {
this("R.Litheswar");
	System.out.println(number1+"\n"+number2);
}
public Constructor1(char gender) {
	this(4,2017);
	System.out.println(gender);
}
public static void main(String[] args) throws Throwable
{
//Constructor1 a=new Constructor1();
//Constructor1 b=new Constructor1("R.Litheshwar");
//Constructor1 c=new Constructor1(4,2017);
//Constructor1 d=new Constructor1('M');
//a.Constructor1();
//b.Constructor1(name);
//c.Constructor1(number1,number2);
//d.Constructor1(gender);
//a.finalize();
//b.finalize();
//c.finalize();
//d.finalize();
Constructor1 d=new Constructor1('M');
}
	
}

