package com.qolsys.core;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		
		for (String user : getListOfUsers()) {
			System.out.println(user);
		}
	}
	
	public static List<String> getListOfUsers() {
		
		List<String> users = new ArrayList<String>();
		users.add("Nishanth");
		users.add("Pradeep");
		users.add("Divya");
		users.add("Bhargavi");
		users.add("Karthik");
		users.add("Kumar");
		users.add("Abhishek");
		
		return users;
	}
}
