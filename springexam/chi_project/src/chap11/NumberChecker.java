package chap11;

import java.util.Scanner;

public class NumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("文字列を入力してください。");
		String str = sc.nextLine();
		
		String result = "数値です。";
		for (int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch)) {
				result= "数値ではありません。";
			}
		}
		System.out.println(result);
	}
}
