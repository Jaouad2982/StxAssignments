package com.syntax.assignments;

import java.util.Scanner;
public class TaskThree {
	static int sumEven = 0 ;
	static int sumOdd = 0;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the start number ?");
	int startNum = s.nextInt();
	System.out.println("Enter the end number ?");
	int endNum = s.nextInt();
		sumOddEven(startNum,endNum);
		s.nextLine();
		purchase();
	}
// first Pro printing oddsum and even sum numbers between two specific numbers;
public static void sumOddEven(int start,int end){
	for( int i=start ; i < end ; i++) {
		if(i % 2 == 0) {
			sumEven = sumEven + i;
		}else if(i % 2!=0) {
			sumOdd = sumOdd + i;
		}
	}
		System.out.println("The sum of your odd numbers is  " + sumOdd);
		System.out.println("The sum of your even numbers is " + sumEven);
	}
	
// second pro which is composed of three static methods
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
			System.out.println("Your change is " + (price-itemPrice));
		}else if(itemPrice == price) {
			System.out.print("You gave me the right change, Thank you ");
		}else if(price < itemPrice) {
			inneWhileCheckRem(totalPrice,itemPrice,price);
		}
	}
	public static void purchase() {
		int priceLess= 0;
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
