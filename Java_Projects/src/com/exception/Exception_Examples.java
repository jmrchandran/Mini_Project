package com.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception_Examples {
	public static void main(String[] args) {
		int a = 19, b = 45;
		int c = a + b;
		System.out.println("The new Value of C is: " + c /0);
		// The new Value of C is: 8
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.exception.Exception_Examples.main(Exception_Examples.java:7)
//		String str = null;
//		System.out.println(str.length());
//Welcome to Chennai:18
//Exception in thread "main" java.lang.NullPointerException
//at com.exception.Exception_Examples.main(Exception_Examples.java:12)
//Scanner sc=new Scanner(System.in);
//		int nextInt = sc.nextInt();
//		System.out.println("Please see the value of entered intger is:" + nextInt);
//3456
//Please see the value of entered intger is:3456
//hello
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at com.exception.Exception_Examples.main(Exception_Examples.java:19)
//		int a[] = new int[4];
//		System.out.println(a[4]);
//		
//index of 3 is: 0
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
//at com.exception.Exception_Examples.main(Exception_Examples.java:31)
//		String str1 = "Welcome to Dindigul";
//		char charAt = str1.charAt(20);
//		System.out.println("The character give as:" + charAt);
//The character give as:i
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
//at java.lang.String.charAt(Unknown Source)
//at com.exception.Exception_Examples.main(Exception_Examples.java:36)
//		List<String> l = new ArrayList<String>();
//		l.add("Hello World");
//		String string = l.get(1);
//System.out.println(string);
//Hello World
//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
//at java.util.ArrayList.rangeCheck(Unknown Source)
//at java.util.ArrayList.get(Unknown Source)
//at com.exception.Exception_Examples.main(Exception_Examples.java:46)
//		String str2 = "Welcome@123";
//		int parseInt = Integer.parseInt(str2);
//		System.out.println(parseInt);
//Exception in thread "main" java.lang.NumberFormatException: For input string: "Welcome@123"
//	at java.lang.NumberFormatException.forInputString(Unknown Source)
//	at java.lang.Integer.parseInt(Unknown Source)
//	at java.lang.Integer.parseInt(Unknown Source)
//	at com.exception.Exception_Examples.main(Exception_Examples.java:54)

	}
}
