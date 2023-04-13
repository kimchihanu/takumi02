package oop2;

public class Circle {
	private Integer bKinh;
	public Integer getbKinh() {
		return bKinh;
	}
	public void setbKinh(Integer bKinh) {
		this.bKinh = bKinh;
	}
	public int chuVi() {
		return (int) (bKinh*2*Math.PI);
	}
	public int dienTich(){
		return (int) ((bKinh*bKinh)*Math.PI);
	}



	
	
}
