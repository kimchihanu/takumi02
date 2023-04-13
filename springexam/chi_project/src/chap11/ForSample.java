package chap11;

import java.util.Scanner;

public class ForSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始値を入力してください。");
		String startStr = sc.nextLine();
		System.out.println("終了値を入力してください。");
		String endStr = sc.nextLine();
		
		int start = Integer.parseInt(startStr);
		int end = Integer.parseInt(endStr);
		
		int result = 0;
		for(int i = start;i <= end; i++) {
		result +=i;
		}
		System.out.println(result);
	}

}
