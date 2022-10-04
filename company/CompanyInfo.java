package org.company;

public class CompanyInfo {
	private static final String Boolean = null;


	private void companyName() {
		System.out.println();

	}
	private void companyName(String name) {
		System.out.println("company name:"+name);
	}
	private void companyName(int Id) {
		System.out.println("company  Id:"+Id);

	}
	private void companyName(long phonenumber) {
		System.out.println("Copmany Phonenumber :"+phonenumber);

	}
	
	private void companyName(float code) {
		System.out.println("company code:"+code);
		

	}
	private void companyName(Boolean statistics) {
		System.out.println("Number one company:"+ Boolean);
	}
	private void companyName(String subname,int age) {
		System.out.println("company subname: "+ subname+ "\ncompanyage:"+age);
	}
	public static void main(String[] args) {
		CompanyInfo c= new CompanyInfo();
		c.companyName();
		c.companyName("CTS");
		c.companyName(22);
		c.companyName(9876543210l);
		c.companyName(2.6f);
		c.companyName(true);
		c.companyName("ctts", 10);
				
	}

}
