package chap11;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("数値を入力してください。");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("回数を入力してください。");
		int times = Integer.parseInt(sc.nextLine());
		
		int result = 1;
		for (int i=1;i<=times;i++) {
			result *=num;
			
		}
		System.out.println("結果は"+result+"です。");
	}

}
