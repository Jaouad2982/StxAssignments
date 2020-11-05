package com.syntax.assignments;
import java.util.Scanner;
import java.util.Scanner;
class Main {
  public static void main(String[]arg){
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter your gender: M or F");
    char gen = s.next().charAt(0);
    System.out.println("Please enter your age");
    int age = s.nextInt();
    if(age > 25){
      if(gen == 'F'){
        System.out.println("Woman");
      }else{
        System.out.println("Man");
      }
    }else if(age < 25){
      if(gen == 'F'){
        System.out.println("Girl");
      }else{
        System.out.println("Boy");
      }
    }
  }
}