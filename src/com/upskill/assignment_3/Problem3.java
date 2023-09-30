package com.upskill.assignment_3;

public class Problem3 {

	void displayInterestRate(){
		System.out.println("Default interest rate is NONE");
	}

	public static void main(String[] args) {
		Problem3 obj=new ChaseBank();
		obj.displayInterestRate();
		new CityBank().displayInterestRate();
		new TDBank().displayInterestRate();
	}
}

class ChaseBank extends Problem3{
	void displayInterestRate(){
		System.out.println("Chase Bank interest rate is 8%");
	}
}

class CityBank extends Problem3{
	void displayInterestRate(){
		System.out.println("City Bank interest rate is 7%");
	}
}

class TDBank extends Problem3{
	void displayInterestRate(){
		System.out.println("TD Bank interest rate is 9%");
	}
}
