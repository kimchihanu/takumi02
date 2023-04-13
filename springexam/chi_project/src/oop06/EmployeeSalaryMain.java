package oop06;

public class EmployeeSalaryMain {
	public static void main(String[] args) {
 
		EmployeeSalary employeeSalary = EmployeeSalaryFactory.getInstance();
		System.out.println("給与額は" + employeeSalary.getSalary() + "です。");
 }
}