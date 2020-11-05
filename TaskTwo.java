package com.syntax.assignments;

import java.util.Scanner;

public class TaskTwo {
	static Scanner s = new Scanner(System.in);
	public static void main(String[]args) {
		printNums();
		getCreditCard();
	}
	//print Nums not divisible by 3 from 1 to 50
	public static void printNums() {
		for(int i = 2 ; i<= 50 ; i++) {
			if(i % 3!= 0) {
				System.out.print(i+"\t");
			}
		}
	}
	//Asking for a credit Card
	public static void getCreditCard() {
		while(true) {
			System.out.println("\nWould you like a credit Card ?");
			String answer = s.nextLine();
			if(answer.toLowerCase().equals("yes")) {
				break;
			}
		}
	}
}
