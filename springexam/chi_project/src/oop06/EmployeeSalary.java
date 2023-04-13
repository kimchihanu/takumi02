package oop06;

public class EmployeeSalary {
	private Integer year;//khai bao bien
	
	//tao constructor
	public EmployeeSalary (Integer year) {
		this.year = year;
	}
	//tao phuong thuc tinh luong
	public int getSalary() {
		int Salary = 210000;//khoi tao bien firstSalary
		for (int i = 1; i<=year; i++) {
		if(i<=10) {
			Salary +=10000;
		}else {
			Salary +=20000;
		}
		}
		return (int)Salary;
	}
}