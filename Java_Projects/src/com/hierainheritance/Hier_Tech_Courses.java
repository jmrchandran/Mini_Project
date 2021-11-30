package com.hierainheritance;

public class Hier_Tech_Courses extends Hier_Sci_Dept {
	private void tech_cours() {
		System.out.println("Technology Courses as below");
		System.out.println("ECE" + "\n" + "Mechanical" + "\n" + "Civil" + "\n");
	}

	private void tech_counts() {
		System.out.println("Technology Courses count as below");
		System.out.println("76" + "\n" + "67" + "\n" + "60" + "\n");
	}
public static void main(String[] args) {
	Hier_Arts A=new Hier_Arts();
	Hier_Info_Tech I=new Hier_Info_Tech();
	Hier_Sci_Dept S=new Hier_Sci_Dept();
	Hier_Tech_Courses T=new Hier_Tech_Courses();
	A.arts_dept();
	A.arts();
	A.artscount();
	I.info_dept();
	I.info_depts();
	I.info_counts();
	S.science_dept();
	S.sci_depts();
	S.sci_counts();
	T.tech_courses();
	T.tech_cours();
	T.tech_counts();
	
}
}

