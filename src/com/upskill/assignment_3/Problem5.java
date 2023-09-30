package com.upskill.assignment_3;

public class Problem5 {

	public static void main(String[] args) {
		for (int i=1;i<=50;i++)
			if (i%3==0&&i%5==0){
				System.out.println("DingDong");
			}else if (i%3==0){
				System.out.println("Ding");
			}else if (i%5==0){
				System.out.println("Dong");
			}
			else
				System.out.println(i);
	}
}

