package org.test.client;

import org.test.cts.*;

public class Client extends Company {

	
	public void clientName() {
		System.out.println("Client Name is Peri Peri");
		
	}
	public static void main(String[] args) {
		Client cl=new Client();
		cl.clientName();
		cl.companyID();
		cl.companyName();
		cl.empId();
		cl.empName();
	}
	
}
