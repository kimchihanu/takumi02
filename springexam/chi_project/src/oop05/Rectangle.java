package oop05;

import java.util.Scanner;

public class Rectangle implements Shape{
	private int width;
	private int height;
	
	public Rectangle(Scanner sc) {
		System.out.println("幅を入力してください。");
		width = Integer.parseInt(sc.nextLine());
		System.out.println("高さを入力してください。");
		height = Integer.parseInt(sc.nextLine());
		
	}

	@Override//ghi de
	public int circumference() {	
		return 2*(width+height);
	}

	@Override
	public int area() {
		return width*height;
	}

}
