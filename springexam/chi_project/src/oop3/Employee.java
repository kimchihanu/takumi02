package oop3;

public class Employee {
	private Integer year;//khai bao bien
	
	//tao constructor
	public Employee (Integer year) {
		this.year = year;
	}
	//tao phuong thuc tinh luong
	public int salary() {
		int firstSalary = 210000;//khoi tao bien firstSalary
		for (int i = 1; i<=year; i++) {
		if(i<=10) {
			firstSalary +=10000;
		}else {
			firstSalary +=20000;
		}
		}
		return (int)firstSalary;
	}
}