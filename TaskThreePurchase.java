package com.syntax.assignments;

import java.util.Scanner;

public class TaskThreePurchase {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		purchase();
		s.nextLine();
		buyAgain();
		
	}
	
	public static void buyAgain() {
		System.out.println("Would you like to make another purchase enter yes or no ");
		String answer = s.nextLine();
		while(answer.trim().equalsIgnoreCase("yes")) {
		
			purchase();
			s.nextLine();
		    if (answer.trim().equalsIgnoreCase("no")) {
				System.out.println("Thanks for using our portal,hope to see you again!!!");
				break;
			}
		}
	}

	public static void inneWhileCheckRem(int totalPrice,int itemPrice,int price) {
		while(totalPrice < itemPrice) {
			totalPrice = totalPrice + price;
			if(itemPrice - totalPrice == 0) {
				System.out.println("Your covered the price,Thank you for Shopping with us");
				break;
				}
			System.out.println("You still have to pay " + (itemPrice - totalPrice));// calculates the remaining amount until the
			// total price is covered by the purchaser.....
			System.out.println("How much you would like to pay again ?");
			// paying the remainder
			price = s.nextInt();
			}
	}
	
	public static void outerLoopCheck(int price,int itemPrice,int totalPrice) {
		if(price > itemPrice) {
			System.out.println("Your change is " + (price-itemPrice) + "Thank you");
		}else if(itemPrice == price) {
			System.out.print("You gave me the right change, Thank you ");
		}else if(price < itemPrice) {
			inneWhileCheckRem(totalPrice,itemPrice,price);
		}
	}
	public static void purchase() {
		System.out.println("Please Enter the item you would like to buy? ");
		String item = s.nextLine();
		System.out.println("Please Enter the total cost of the item, you would like to buy");
		int itemPrice = s.nextInt();
		System.out.println("Please Enter How much you would like to pay ?");
		int price = s.nextInt();
		int totalPrice = 0;
		while(true) {
			outerLoopCheck(price,itemPrice,totalPrice);
			break;
		}
	}
}
