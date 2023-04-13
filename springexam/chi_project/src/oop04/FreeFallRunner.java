package oop04;

import java.math.BigDecimal;

public class FreeFallRunner {
	private Integer sec;
	private BigDecimal gforce;
	
	public FreeFallRunner(Integer sec) {
		this.sec=sec;
	}
	public FreeFallRunner (String gforce) {
		this.gforce = new BigDecimal(gforce);
	}
	public FreeFallRunner() {
		this("9.8"); //goi 1 constructor -> goij dden phuong thuc
		}
	
	public String Kcach (int sec) {
		BigDecimal result = gforce.multiply(new BigDecimal(sec)).multiply(new BigDecimal(sec)).divide(new BigDecimal(2));
		return result.setScale(1, BigDecimal.ROUND_HALF_UP).toString();
	}
	public String vToc(int sec) {
		//m/s
		BigDecimal vTocms = gforce.multiply(new BigDecimal(sec));
		//km/s
		BigDecimal vTockmh = vTocms.multiply(new BigDecimal(3.6));
		return vTockmh.setScale(1, BigDecimal.ROUND_HALF_UP).toString();

	}
}
