package oop3;

public class Parttimer {
	private Integer hourlyRate;
	private Integer workHour;
	
	public Parttimer(Integer hourlyRate, Integer workHour) {
		this.hourlyRate = hourlyRate;
		this.workHour = workHour;
	}
	public int salary() {
		return hourlyRate * workHour;
}
}