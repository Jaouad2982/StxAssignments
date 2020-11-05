package com.syntax.assignments;

import java.util.Scanner;

public class Sale {
	static int commission = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("What is the sale amount ? ");
		double amount = s.nextDouble();
		checkSale(amount);
		
	}
	public static void checkSale(double amount) {
		if(amount > 10 && amount <20) {
			commission = 10;
			System.out.println("Your commission is " + commission);
		}else if(amount > 100 && amount <200) {
			commission = 20;
			System.out.println("Your commission is " + commission);
		}else if(amount > 200 && amount <500) {
			commission = 30;
			System.out.println("Your commission is " + commission);
		}else if(amount > 500) {
			commission = 50;
			System.out.println("Your commission is " + commission);
		}
	}

}
