package com.upskill.java_5;

public abstract class AbstractClass {

	 public abstract void iDoor();	
	 public abstract void iWheel();
	 public abstract void iSeat();
	 public abstract void iColor();

	 public void music (){
		 System.out.println("Sound System");
		 
	 }
	 
	 public void brand (){
		 System.out.println("Tesla");
	 }
	 
	 /*
		(Parent)				   (Keyword) 				(Child)									
		Class						extends			 		Class
		Abstract Class	(+2)		extends			 		Class	(-2)
		Interface		(+2)		implements				Class	(-2)
		Interface		(+2)		extends					Interface (+2)		implements		Class(-4)

		*/
}

