package com.stringfunctions;

public class String_Functions {
	public static void main(String[] args) {
		String s = "Welcome to India and behalf of Litheshwar";
		int length = s.length();
		System.out.println("Total Length is:" + length);
		boolean equals = s.equals("Welcome to India and behalf of Litheshwar");
		System.out.println("Check equal string or not:" + equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Welcome To India");
		System.out.println("Without case: " + equalsIgnoreCase);
		String upper = s.toUpperCase();
		System.out.println("Convert to uppercase:" + upper);
		String lower = s.toLowerCase();
		System.out.println("Convert to lower case:" + lower);
		boolean startsWith = s.startsWith("Welcome");
		System.out.println("Find Starts with:" + startsWith);
		boolean endsWith = s.endsWith("eshwar");
		System.out.println("Endswith workds:" + endsWith);
		boolean contains = s.contains("India");
		System.out.println("Contains or not: " + contains);
		int indexOf = s.indexOf('I');
		System.out.println("this letter contains or not:" + indexOf);
		int lastIndexOf = s.lastIndexOf('r');
		System.out.println("last index found as r:" + lastIndexOf);
		char charAt = s.charAt(34);
		System.out.println("The given number character is:" + charAt);
		String replace = s.replace("India", "TamilNadu");
		System.out.println("The replaced lines are:" + replace);
		String subString = s.substring(12);
		System.out.println("Substring is: " + subString);
		String subString2 = s.substring(14, 24);
		System.out.println("Substring are: " + subString2);
		String a = "";
		boolean isEmpty = a.isEmpty();
		System.out.println("The lines are empty or not: " + isEmpty);
		String[] split = s.split(" ");
		for (String string : split) {
			System.out.println("splitted lines are below:" + string);
		}
		String b = "        Manimegalai is my Grand Mother      ";
		String trim = b.trim();
		System.out.println("Trimmed lines are: " + trim);
		String concat = s.concat(trim);
		System.out.println("Concordination lines are: "+" " + concat);
	}
}
