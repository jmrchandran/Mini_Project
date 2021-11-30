package com.mlinheritance;

public class Pharmacist_Names extends Nurses_List{
private void names2(String P1,String P2,String P3) {
	System.out.println("Pharmacist list is:"+"\n"+P1+"\n"+P2+"\n"+P3);
}
@Override
public void names(String D1,String D2,String D3) {
	super.names(D1, D2, D3);
}
@Override
public void names1(String N1,String N2,String N3) {
	super.names1(N1,N2,N3);
}
public static void main(String[] args) {
	Pharmacist_Names Hospital=new Pharmacist_Names();
	Hospital.names("Paramasivam", "Abdullah", "John");
	Hospital.names1("Stella", "Eswari", "Banu");
	Hospital.names2("Jack", "Mohan", "Moien");
}
}
