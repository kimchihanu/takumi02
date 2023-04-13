package chap06;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください。");
		int num = Integer.parseInt(sc.nextLine());
		int result = num * num;
		System.out.println("2乗の結果は"+result+ "です。");
			
			
	}

}
