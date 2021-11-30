package com.control;

public class If_Elseif {
	public static void main(String[] args) {
		int marks = 201;
		if (marks >= 150 && marks <= 200) {
			System.out.println("Passed First Class with Distintiction in Mathematics");
		} else if (marks >= 120 && marks <= 149) {
			System.out.println("Passed First class in Mathematics");
		}
			else if (marks >= 70 && marks <= 119) {
				System.out.println("Passed in Mathematics");
						} 
			else if(marks>200) {
				System.out.println("Error in result");
			}
				else {
			System.out.println("Fail in Mathematics");
		}
	}
}


