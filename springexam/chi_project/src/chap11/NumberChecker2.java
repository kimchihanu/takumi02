package chap11;

import java.util.Scanner;

public class NumberChecker2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("文字列を入力してください。");
		String str = sc.nextLine();
		
//		String result = "数値です。";
		Boolean isNumberOnly = true;
		for (int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch<'0'||ch >'9') {
				isNumberOnly = false;
			}
//			if(ch>='0' && ch<='9') {
//				i++;}
//				else {
//				result = "数値ではありません。";}
		}
		if(isNumberOnly) {
			System.out.println("数値です。");
		}else {
				System.out.println("数値ではありません。");
				}
	}
}
