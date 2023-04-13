package oop3;

import java.util.Scanner;

public class Cirlcemain {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("半径を入力してください。");
			int bKinh = Integer.parseInt(sc.nextLine());
			
			Circle circle = new Circle (bKinh);
			
			System.out.println("円周："+circle.chuVi());
			System.out.println("面積："+circle.dienTich());
			
}
}