package com.upskill.assignment_2;

public class GradeCalculator {
	
	    public static void main(String[] args) {
	        int marks = 85;
	        calculateGrade(marks);
	    }
	    
	    public static void calculateGrade(int marks) {
	        if (marks >= 90) {
	            System.out.println("Grade A");
	        } else if (marks >= 80 && marks <= 89) {
	            System.out.println("Grade B");
	        } else if (marks >= 70 && marks <= 79) {
	            System.out.println("Grade C");
	        } else if (marks >= 60 && marks <= 69) {
	            System.out.println("Grade D");
	        } else {
	            System.out.println("Fail");
	        }
	    }
	}









