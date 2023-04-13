package oop2;

public class DiscomfortIndex {
	private Integer temperature;
	private Integer humidity;
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public Integer getHimidity() {
		return humidity;
	}
	public void setHimidity(Integer himidity) {
		this.humidity = humidity;
	}
	public double indexValue() {
		return 0.81*temperature+0.01*humidity*(0.99*temperature-14.3)+46.3;
	}
	public String feel() {
		double indexValue = indexValue();
		String result = null;
		if(indexValue < 60) {
			result = "寒い";
		}else if(indexValue<=75) {
			result="快適";
		}else {
			result="暑い";
		}
		return result;
	}
			
}
