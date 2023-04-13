package oop05;

public class MockEmployeeSearchServiceImpl implements EmployeeSearchService{
	@Override
	public Employee searchByNo(String no) {
	Employee employee = null;
	if(no.equals("1")){
	employee = new Employee();
	employee.setNo("1");
	employee.setName("山田太郎");
	}
	return employee;
	}
	}
