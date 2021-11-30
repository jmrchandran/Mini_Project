package com.abstraction;

public class Abstract_Personal_Hide extends Abstract_Personal_Details{
	@Override
	public void password() {
		System.out.println("dindigul@17");
	}
	public static void main(String[] args) {
		Abstract_Personal_Hide a= new Abstract_Personal_Hide();
		a.userName1();
		a.userMail();
		a.dob();
		a.password();
	}

}
