package com.syntax.assignments;
/*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
 *  Method should be visibly only within same package and accessible by the creating an instance of the class. 
Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
 Method should be available inside the class only where it was declared and executed by calling it is name. */
public class MethodsCreation {
	public static void main(String[]args) {
		listOfMethods();
	}
	public static void listOfMethods() {
		int []arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("The sum of the array element is " + new MethodsCreation().sumArray(arr));
		System.out.println("The reverse String is " + reverseString(new StringBuffer("Hello World")));
		System.out.println("The String composed only of vowels is " + MethodsCreation.vowels("Hello this is euuuuuhello"));
	}
	 int sumArray(int[]ar) {
		int sum = 0;
		for(int elem:ar) {
			sum +=elem;
		}
		return sum;
	}
	public static StringBuffer reverseString(StringBuffer str) {
		return str.reverse();
	}
	private static String vowels(String str) {
		String charString = "";
		char [] vowels = {'a','u','o','i','e'};
		for(int i = 0 ; i <str.length() ;i++) {
			for(int j = 0 ; j <vowels.length ;j++) {
				if(str.charAt(i) == vowels[j])
					charString +=str.charAt(i); 
			}
		}
		return charString;
	}
}
