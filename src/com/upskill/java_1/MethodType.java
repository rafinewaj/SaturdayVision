package com.upskill.java_1;


/* 	Types of Methods

1.Void Method
2.Static Method
3.Return Type Method  
*/


public class MethodType {
	
	public static int hourlyIncome = 65;
	public static void main(String[]args){
		System.out.println("upskill");
		weeklyIncomeStatic();
		
		
		MethodType myobj  = new MethodType ();
		myobj.annualIncomevoid();
		
		System.out.println("My Monthly Income="+ myobj.monthlyIncomeReturn());
	}
	

	//void method is non static method and  we need to create a object of this class to call
	//we dont return any data in void method
	public void annualIncomevoid(){  
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income =" + calculateAnnualIncome);
		
	}
	//Static Method  we can call directly
	public static void weeklyIncomeStatic(){ 
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income =" + calculateWeeklyIncome);
		
	}
	//Return Type Method
	public int monthlyIncomeReturn(){
	int calculateMonthlyIncome = hourlyIncome * 180;
	return calculateMonthlyIncome;
	
		
}	
}
