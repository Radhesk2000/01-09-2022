package com.oops.bll;

public class TestAuthor {
	public static void main(String[] args) {
		Author A1 = new Author();
		Author A2 = new Author("Radheshyam","Radhe");
		Author A3 = new Author("Radheshyam","Radhe","Computer Science");
		
		System.out.println("First Name: "+A2.getFirstName());
		System.out.println("Last Name: "+ A2.getLastName());
		System.out.println("Book Name & Author: "+A3.toString());
		System.out.println(A1);

	}


}
