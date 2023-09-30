package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	private static final String City = null;

	public static void main(String[] args) {
		//Aray store multiple data using index
		
		
		int gge = 30 ;                                      //variable
	    int [] ageVision = new int []{21, 26, 28, 30, 35};  //Array
		
		//Array index      [0] [1] [2] [3] [4]
		System.out.println("student Age: " + ageVision[2]);
		System.out.println("Total student : " + ageVision.length);

		String  a = "Shahin";                                      
		String [] nameVision = new String []{"Shahin" , "Samiul","MIZAN", "David"};  
		String [] nameVision1 = new String []{"BANGLADESH" , "USA","UK", "CANADA"};  
		
	
		System.out.println("student Name: " + nameVision1[1]);
		System.out.println("Total student : " + nameVision1.length);
		
		
		//Hashmap store multiple data using key-value pair, Implementation of map interface
		
		HashMap<String, Integer> student = new HashMap<String, Integer> ();
		student.put("Shahin", 30);
		student.put("Samiul", 19);
		student.put("Mizan", 26);
		student.put("David", 22);
		System.out.println("Hashmap Student Age : "+ student.get("Shahin"));
	
		


	HashMap<String, String> Country = new HashMap<String, String > ();
	Country.put("Bangladesh"," Dhaka");
	Country.put("USA", "New York");
	Country.put("UK", "LONDON");
	
	System.out.println("Country :" + Country.get("UK"));
	
	//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)
	
			Hashtable<String, String> Region = new Hashtable<String, String>();
			
			Region.put("BD", "Asia");
			Region.put("USA", "America");
			
			System.out.println("Region : " + Region.get("BD"));

			//Hashset store unordered collection containing unique value, Implementation of Set interface
			
			HashSet<String> car = new HashSet<String>();
			
			car.add("Tesla");
			car.add("BMW");
			car.add("Toyota");
			car.add("Audi");
			car.add("Ford");
			
			System.out.println("Car : " + car);
			
	
	
	}
}
 