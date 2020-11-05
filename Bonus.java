package com.syntax.assignments;

import java.util.Scanner;

/*  Write a program to ask user to enter numbers of worked years and annual salary. 
 * If user worked for more or equals to 5 years than user is eligible for the bonus,
 *  otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.

 */
public class Bonus {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of work years");
		int numOfYears = s.nextInt();
		calculateBonus(numOfYears);
		
	}
	public static void calculateBonus(int numOfYears) {
		if(numOfYears >= 5) {
			System.out.println("Enter your salary");
			double salary = s.nextDouble();
			if(salary > 50000) {
				System.out.println("Your bonus is " + 5000);
			}else {
				System.out.println("Your bonus is " + 3000);
			}
		}else {
			System.out.println("You are not eligible for a bonus");
		}
	}

}
