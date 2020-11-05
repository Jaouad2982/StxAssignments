package com.syntax.assignments;

public class TaskOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listOfMethods();
	}
	public static void listOfMethods() {
		System.out.println("=========printing nums from 1 to 100 or any other number with a space=========");
		printNumbers(100);
		System.out.println();
		System.out.println("=========printing nums from 100 to 1========");
		prNumbers();
		System.out.println();
		System.out.println("=========printing Even nums from 21 to 1========");
		printEvenNumsOne();
		System.out.println();
		System.out.println("=========printing Even nums from 21 to 1 second method========");
		printEvenNumsTwo(1,21);
	}
	// printing numbers from 1 to 100 with space
	public static void printNumbers(int number) {
		for(int i = 1 ; i <=100 ; i++) {
			System.out.print(i+"\t");
		}
	}
	//printing nums from 100 to 1
	public static void prNumbers() {
		for(int i = 100 ; i > 0 ; i--) {
			System.out.print(i +"\t");
		}
	}
	//=========printing Even nums from 21 to 1========
	public static void printEvenNumsOne() {
		for(int i = 21 ; i >=1 ;i-- ) {
			if(i % 2 == 0 ) {
				System.out.print(i + "\t");
			}
		}
	}
	//printing Even nums from 21 to 1 second method
	public static void printEvenNumsTwo(int numMin,int numMax) {
		while(numMax > numMin) {
			if(numMax % 2 == 0) {
				System.out.print(numMax + "\t");
			}
			numMax--;
		}
	}
}
