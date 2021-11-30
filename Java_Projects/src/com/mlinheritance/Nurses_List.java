package com.mlinheritance;

public class Nurses_List extends Doctors_List{
	public void names1(String N1,String N2,String N3) {
		System.out.println("Nurses List is:"+"\n"+N1+"\n"+N2+"\n"+N3+"\n");
	}
	@Override
	public void names(String D1,String D2,String D3) {
		super.names(D1,D2,D3);

		
	}

}
