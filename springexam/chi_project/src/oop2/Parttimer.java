package oop2;

public class Parttimer {
	private Integer hourlyRate;
	private Integer workHour;
	public Integer getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(Integer hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public Integer getworkHour() {
		return workHour;
	}
	public void setHourWork(Integer workHour) {
		this.workHour = workHour;
	}
	
	public int salary() {
		return hourlyRate * workHour;
	}
	
}
