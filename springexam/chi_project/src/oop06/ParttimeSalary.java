package oop06;

public class ParttimeSalary extends EmployeeSalary{
	private Integer hourLyPay;
	private Integer workHours;
	
	public ParttimeSalary(Integer hourLyPay, Integer workHours) {
		super(0);
		this.hourLyPay = hourLyPay;
		this.workHours = workHours;
	}
		@Override
		public int getSalary() {
			return hourLyPay*workHours;
		}
			
	}

