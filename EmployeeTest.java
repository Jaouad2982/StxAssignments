package com.syntax.assignments;
/*Create a Class called Employee: Create three  variables  empID , salary and set the CEO to “Sumair” 
Create two objects of the class Employee Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects */
 class Employee{
	private String empId;
	private double salary;
	private final static String CEO = "Sumair";
	public String getEmp() {
		return this.empId;
	}
	public void setEmp(String empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee Id is " + this.empId +"\n" + "Employee Salary is " + this.salary+ " \n" + "CEO :" + CEO;
		
	}
	
 }
 public class EmployeeTest{
	public static void main(String[]args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setEmp("ID : 1234");
		emp1.setSalary(129933.00);
		emp2.setEmp("ID : 34455");
		emp2.setSalary(999999.00);
		printInfo(emp1);
		System.out.println("========================");
		printInfo(emp2);
	}
	public static void printInfo(Employee emp) {
		System.out.println(emp.toString());
	}
	

 }
