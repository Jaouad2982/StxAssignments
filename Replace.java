package com.syntax.assignments;

public class Replace {
	public static void main(String[] args) {
	    String mix = "3213Hello 89 World354545 *&***^&*^&*";
	    System.out.println(mix.replaceAll("[0-9]", ""));
	    System.out.println(mix.replaceAll("[a-z]", ""));
	    System.out.println(mix.replaceAll("[a-z A-Z]", ""));
	    System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));
	    System.out.println(mix.replaceAll("\\s+", ""));
	    int m=2, total=0;

	    while(m<6) {

	       total=total+m;

	       m++;

	    }

	    System.out.print(total);
	}

}
