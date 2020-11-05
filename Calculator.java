package com.syntax.assignments;
/* HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
 * Based on operator provide the result to user. */
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
      new Calculator().checkFinal();		
		
	}
	public void checkFinal() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number one");
		int num1 = s.nextInt();
		System.out.println("Enter number two");
		int num2 = s.nextInt();
		System.out.println("What Would you like to do ? \n'+' For addition\n'-' For substraction\n'*' For multiplication\n'/' for division \n'%' for modulus operation ");
		String operation = s.next();
		System.out.println("The result of your selected operation is " + checkMath(operation,num1,num2));
	}
	
	public static int checkMath(String op,int num1,int num2) {
		switch(op) {
		case "+" : return num1 + num2;
		case "-" : return num1 - num2;
		case "/" : return num1 / num2;
		case "*" : return num1 * num2;
		case "%" : return num1 % num2;
		default :  return 0;
		}
	}

}
