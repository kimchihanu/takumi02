package oop3;

public class DiscomfortIndex {
	private Integer temperature;
	private Integer humidity;
	private Double indexValueCache;
	
	public DiscomfortIndex(Integer temperature, Integer humidity) {
		this.temperature = temperature;
		this.humidity = humidity;

	}
	public double indexValue() {
		if(indexValueCache == null) {
			indexValueCache = 0.81*temperature+0.01*humidity*(0.99*temperature-14.3)+46.3;
		}
		return indexValueCache;
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
