package oop01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("社員数を入力してください");
		int num = Integer.parseInt(sc.nextLine());
		
		List<Employee> employeeList = new ArrayList<Employee>();
		for (int i = 0; i<num; i++) {
			Employee employee = new Employee(); //khai bao instance
			
			System.out.println("社員番号を入力してください。");
			employee.setEmpNo(sc.nextLine());
			System.out.println("社員名を入力してください。");
			employee.setName(sc.nextLine());
			System.out.println("月給を入力してください。");
			employee.setSalary(Integer.parseInt(sc.nextLine()));
			
			employeeList.add(employee);	//add employee vao employeeList
			
		}
		int totalSalary = 0;
		for(Employee e:employeeList) {
		totalSalary +=e.getSalary();
	}
		for (Employee e : employeeList){
		System.out.println("社員番号："+e.getEmpNo()+"社員名"+e.getName()+"月給"+e.getSalary());
		}
		System.out.println("月給合計："+totalSalary);
		}
		
	}

