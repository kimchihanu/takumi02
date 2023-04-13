package oop04;

public class SalesTax {
	//khai bao doi so kieu int
	private Integer priceTotal;
	
	//tao constucor
	public SalesTax (Integer priceTotal) {
		this.priceTotal=priceTotal;
	}
	//tap phuong thuc
	public int amountOfTax() {
		return amountOfTax(5);
	}
	public int amountOfTax(int rate) {
		double tax = (double)priceTotal * rate/100;
		return (int)tax;
	}
}
