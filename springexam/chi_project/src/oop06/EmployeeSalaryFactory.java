package oop06;

import java.util.Scanner;

public class EmployeeSalaryFactory {
 
	public static EmployeeSalary getInstance(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("社員の種類を入力してくさい。（１：社員、２：アルバイト）");
		String type = scanner.nextLine();
		
		
		EmployeeSalary employeeSalary = null;
		if (type.equals("1")) {
			System.out.println("勤続年数を入力してください。");
			int serviceYears = Integer.parseInt(scanner.nextLine());
			employeeSalary = new EmployeeSalary(serviceYears);	
		}else if (type.equals("2")) {
			System.out.println("時給を入力してください。");
			int hourlyPay = Integer.parseInt(scanner.nextLine());
			System.out.println("勤務時間を入力してくだい。");
			int workHours = Integer.parseInt(scanner.nextLine());
			employeeSalary = new ParttimeSalary (hourlyPay,workHours);
			}
		
		return employeeSalary;
 }
}