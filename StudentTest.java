package com.syntax.assignments;
/*Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class Set the value for  studentName , studentID and increment
  the numberOfStudents for each object
Print out  total number of students */
 class Students {
	
	private String studentName;
	private int studentID;
	private int numberOfStudents;


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	public String toString() {
		return "Student Name: "+ this.studentName +" \n"+ "Student ID: "+this.studentID;
	}
}
	public class StudentTest{
		public static Students std1 = new Students();
		public static Students std2 = new Students();
		public static void main(String[]args) {
		 getResults();
		}
		
		public static void getResults() {
			std1.setStudentName("John wick");
			std1.setStudentID(12333);
			std1.setNumberOfStudents(123);
			std2.setStudentName("Ono");
			std2.setStudentID(92929);
			std2.setNumberOfStudents(987);
			printInfo(std1);
			printInfo(std2);
			getTotalNumofStudents();
		}
		
		public static void getTotalNumofStudents() {
			System.out.println("The number of students is " + (std2.getNumberOfStudents() + std1.getNumberOfStudents()));
		}
		
		public static void printInfo(Students std) {
			System.out.println(std.toString());
		}
	
	}
