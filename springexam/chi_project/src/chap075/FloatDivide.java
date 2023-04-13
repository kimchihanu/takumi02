package chap075;

import java.util.Scanner;

public class FloatDivide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("割られる小数を入力してください。");
		float dFrom = Float.parseFloat(sc.nextLine());
		System.out.println("割る小数を入力してください。");
		float dTo = Float.parseFloat(sc.nextLine());
		float result = dFrom/dTo;
		System.out.println(result);
	}

}
