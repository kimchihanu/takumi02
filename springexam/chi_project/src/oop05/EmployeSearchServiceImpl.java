package oop05;

import java.util.List;

public class EmployeSearchServiceImpl implements EmployeeSearchService {
	private String no;
	private String name;

	public Employee searchByNo(String empNo) {
	List<String> employeeLines = EmployeeData.getEmployeeLines();
	Employee employee = null;
	//TODO ３．実装
	for(String line : employeeLines) {
//		1:倉本 圭
		String []splited = line.split(":");
		String employeeNo = splited[0];
		if(employeeNo.equals(empNo)){
			employee = new Employee();
			employee.setNo(splited[0]);
			employee.setName(splited[1]);
			break;
		}
	}
	return employee;
	}
	
	}
