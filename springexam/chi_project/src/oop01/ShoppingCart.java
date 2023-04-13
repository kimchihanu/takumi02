package oop01;

public class ShoppingCart {
	private String name;
	private Integer price;
	private Integer num;
	private Integer total;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getTotal() {
		return this.price*this.num;
	}
}
