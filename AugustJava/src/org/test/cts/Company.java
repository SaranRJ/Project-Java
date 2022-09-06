package org.test.cts;

public class Company extends Employee {

	
	public void companyName() {
		System.out.println("CompanyName is CTS");

	}
	public void companyID() {
		System.out.println("Company ID is 54187");

	}
 public static void main(String[] args) {
	
	 Company comp=new Company();
	 comp.companyID();
	 comp.companyName();
	 comp.empId();
	 comp.empName();
	 
}



}


