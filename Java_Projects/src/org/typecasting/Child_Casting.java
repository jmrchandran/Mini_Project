package org.typecasting;

public class Child_Casting extends Parent_Casting{
private void child() {
	String cc="Litheswar R";
	System.out.println("My name is: "+cc);
	}
public static void main(String[] args) {
	Parent_Casting p=new Child_Casting();
	Child_Casting c=new Child_Casting();
	p.parent();
	c.child();
}
}

