package oop2;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("半径を入力してください。");
		int bKinh = Integer.parseInt(sc.nextLine());
		
		Circle circle = new Circle();
		circle.setbKinh(bKinh);
		
		System.out.println("円周："+circle.chuVi());
		System.out.println("面積："+circle.dienTich());
		
	}

}
