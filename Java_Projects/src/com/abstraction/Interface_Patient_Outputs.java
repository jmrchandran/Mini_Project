package com.abstraction;

public class Interface_Patient_Outputs
		implements Interface_Patient_Histories, Interface_Patient_Histories1, Interface_Patient_Histories2 {

	@Override
	public void disease() {
		System.out.println("Cancer" + "\n");
	}

	@Override
	public void disease1() {
		System.out.println("Corona" + "\n");
	}

	@Override
	public void disease2() {
		System.out.println("Dengue" + "\n");
	}

	@Override
	public void disease3() {
		System.out.println("Viral Fever" + "\n");
	}

	@Override
	public void disease4() {
		System.out.println("Malaeria" + "\n");
	}

	@Override
	public void typeVisit() {
		System.out.println("In Patient");
	}

	@Override
	public void typeVisit1() {
		System.out.println("In Patient");
	}

	@Override
	public void typeVisit2() {
		System.out.println("Out Patient");
	}

	@Override
	public void typeVisit3() {
		System.out.println("Out Patient");
	}

	@Override
	public void typeVisit4() {
		System.out.println("Out Patient");
	}

	@Override
	public void patientName() {
		System.out.println("Alpha");
	}

	@Override
	public void patientName1() {
		System.out.println("Beeta");
	}

	@Override
	public void patientName2() {
		System.out.println("Cheeta");
	}

	@Override
	public void patientName3() {
		System.out.println("Elpha");
	}

	@Override
	public void patientName4() {
		System.out.println("Gamma");
	}

	public static void main(String[] args) {
		Interface_Patient_Outputs a = new Interface_Patient_Outputs();
		a.patientName();
		a.typeVisit();
		a.disease();
		a.patientName1();
		a.typeVisit1();
		a.disease1();
		a.patientName2();
		a.typeVisit2();
		a.disease2();
		a.patientName3();
		a.typeVisit3();
		a.disease3();
		a.patientName4();
		a.typeVisit4();
		a.disease4();

	}

}
