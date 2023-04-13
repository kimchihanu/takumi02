package oop05;

import java.util.Scanner;

public class ShapeMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("図形の種類を入力してください。");
		
		String shapeType = sc.nextLine();
		Shape shape = null;
		if (shapeType.equals("1")) {
			shape = new Circle (sc);
		}else if (shapeType.equals("2")) {
			shape = new Rectangle(sc);
		}else if (shapeType.equals("3")){
			shape = new Triangle(sc);
		}
	
		System.out.println("外周は"+shape.circumference()+"です。");
		System.out.println("面積は"+shape.area()+"です。");
	}
}
