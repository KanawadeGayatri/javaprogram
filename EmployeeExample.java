package com.collection;

class User{
	int id;
	String ename;
	public User(int id, String ename) //Parameterized Constructor
	{
		this.id=id;
		this.ename=ename;
		
	}
}
class Employee extends User{    //  Employee subclass 
	double salary;
	Employee(int id ,String ename, double salary){
		super(id,ename);
		this.salary = salary;
		
		 
	}
                           
	void printsalary() {  //calculate the annualsalary
		double annualSalary = salary*12;
		System.out.println("Empolyee:" + ename+ " " +annualSalary);
		
	}
public class EmployeeExample {

	public static void main(String[] args) { 
		//object of the Employee class using the constructor
		

		Employee emp= new Employee(1,"gayatri",20000);
	   emp.printsalary(); 
		
	}
		
	}

}
