package oop05;

import java.util.Scanner;

public class Triangle implements Shape {
	private int bottom;
	private int height;
	
	public Triangle (Scanner sc) {
		System.out.println("底辺を入力してください");
		bottom = Integer.parseInt(sc.nextLine());
		System.out.println("高さを入力してください。");
		height = Integer.parseInt(sc.nextLine());
		
		
	}

	@Override
	public int circumference() {
		
		return (int) (bottom + height + Math.sqrt((bottom*bottom+(height*height))));
	}

	@Override
	public int area() {
		return (bottom*height)/2;
	}
	

}
