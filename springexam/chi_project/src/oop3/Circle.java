package oop3;

public class Circle {
	private Integer bKinh;
	
	public Circle (Integer bKinh) {
		this.bKinh = bKinh;
	}
	public int chuVi() {
		return (int) (bKinh*2*Math.PI);
	}
	public int dienTich(){
		return (int) ((bKinh*bKinh)*Math.PI);
	}
}
