package chap06;

import java.util.Scanner;

public class Substract {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("1つ目の数値を入力してください。");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("2つ目の数値を入力してください。");
		int num2 = Integer.parseInt(sc.nextLine());
		int result = num1 - num2;
		System.out.println("差は"+result+"です。");
	}

}
