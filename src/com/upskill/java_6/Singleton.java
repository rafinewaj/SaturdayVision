package com.upskill.java_6;

public class Singleton {

	// Singleton is class that can have only one object
	
		// Private constructor, it prevents any other class from instantiating
	
	private Singleton (){
		
	}
	//private static object of the class
	private static Singleton  Singletonobj = new Singleton (); 
	  public static Singleton getInstance (){
		  return Singletonobj; 
		  
	  }
	 protected  static void demo (){
		 System.out.println("Demo method for Singleton Class ");
		 
	 }
}

