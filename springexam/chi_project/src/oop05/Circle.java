package oop05;

import java.util.Scanner;

public class Circle implements Shape{
	private int radius;
	
	public Circle(Scanner sc) {
		System.out.println("半径を入力してくだい。");
		radius = Integer.parseInt(sc.nextLine());
		
		
	}

	@Override
	public int circumference() {
		return (int)(2*Math.PI+radius);
	}

	@Override
	public int area() {
		return (int)(Math.PI*(radius*radius));
	}
}
