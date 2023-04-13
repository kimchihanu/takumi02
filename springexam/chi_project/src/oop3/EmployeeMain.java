package oop3;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("連続年数を入力してください。");
		int year = Integer.parseInt(sc.nextLine());
		
		//Khoi tao doi tuong employee
		Employee employee = new Employee(year);
		 System.out.println("給料額は"+employee.salary()+"です。");
	}

}
