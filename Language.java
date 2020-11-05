package com.syntax.assignments;
import java.util.Scanner;
/* Ask user to enter their country and capture it. Once values are captured print which language user speaks   */
public class Language {

	public static void main(String[] args) {
		new Language().Info();
	}
	
	public void Info(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your country");
		String coun = s.nextLine();
		System.out.println("The language of Your selected country is " + new Language().checkLanguage(coun));
	}
	
	public  String checkLanguage(String country) {
		switch(country.toLowerCase()) {
		case "morocco": return "Arabic";
		case "algerie": return "Arabic";
		case "usa": return "English";
		case "turkey": return "Turkish";
		case "france": return "French";
		case "china": return "Chinese";
		default : return "Not listed, Sorry";
		}
		
	}
}
