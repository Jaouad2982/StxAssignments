package com.syntax.assignments;

public class Degree {
	public static void checkMortgage(double rate, int price) {
		if(rate > 4.5) {
			System.out.println("Can not buy a house");
		}else {
			System.out.println("I will consider buying a house");
			if(price >= 200000) {
				System.out.println("I guess I am going to take a loan");
			}else {
				System.out.println("I will just pay in cash, lucky me ");
			}
		}
	}
	
	
	public static void has(boolean hasDegree, double gpa) {
		if(hasDegree) {
			System.out.println("Congratulation");
			if(gpa >= 3.5) {
				System.out.println("You are eligible for a scolarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("You are advised to get a degree");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("java");
		String name = "java";
		System.out.println(a.equals(name));
		checkMortgage(4.2,400000);
		System.out.println("==================================================");
		has(false,3.5);
	}
	
	}
	

