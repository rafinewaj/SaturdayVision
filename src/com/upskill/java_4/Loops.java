package com.upskill.java_4;

public class Loops {
   /*
	  Type of loops
	       1 For loop
	       2 While loop
	       3 Do while loop
	       4 Infinite loop
	*/       
	       
	public static void main(String[] args) {
		//practiceForLoop();
		//practicwhileLoop();
		//practicDowhileLoop();
		//practiceInfiniteLoop();
		practieNestedForLoop();
	}
	     public static void practiceForLoop(){
		   int i;                      
		   for(i = 1; i <=10; i++){
		System.out.println("for Loops number =  "+i);

	}

}
 public static void practicwhileLoop(){
	 int i=1;
	 while (i<=10){
		 System.out.println("while Loops number =  "+i);
		  i++;
	 }
 }
 
 public static void practicDowhileLoop(){
	 int i =1;
	 do {
		 System.out.println("Do while Loop Number = " +i);
		 i++;
	 } while (i<=0);}
	 
 public static void practiceInfiniteLoop(){
	   int i;                      
	   for(i = 1; ; i++ ){
	System.out.println("infinite Loops number =  "+i); 
    }
  }
 public static void practieNestedForLoop(){
	  int i;
	  int j;
	  
	  for(i=1; i<=10; i++){
	    for (j = 1; j<=10; j++){
	    	int multipicationTable =  i * j;
	    	System.out.print(multipicationTable + " ");
	    }
	  System.out.println(" ");
	  
	  }
	  
 }
}