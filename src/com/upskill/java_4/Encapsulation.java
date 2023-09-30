package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "Rasel";				//Write & Read
	private int ssn = 123456;					//Write Only
	private String username = "upskill";		//Read Only
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setSSN(456123654);
		System.out.println(obj.getUsername());
		
		obj.setName("Rafi");
		System.out.println(obj.getName());
	}
	
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//set the data, Write only
	public void setSSN(int value){
		ssn =value;
	}
	
	//Getter Method - username		 			//get the data, Read only
	public String getUsername(){
		return username;
	}

}
