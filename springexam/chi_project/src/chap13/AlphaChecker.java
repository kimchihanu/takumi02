package chap13;

import java.util.Scanner;

public class AlphaChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("文字列を入力してください。");
		String input = sc.nextLine();
		
		boolean result = false;
		for (int i=0; i<input.length() ;i++) {
			char ch = input.charAt(i);
			if (isAlpha(ch)) {
				result = true;
				break;
			}
		}
		
		if(result) {
			System.out.println("アルファベットが存在します。");
		}else {
			System.out.println("アルファベットが存在しません。");
		}
				
	}
	private static boolean isAlpha (char charInput) {
		if ((charInput>='A'&& charInput<='Z')||(charInput>='a' && charInput<='z')) {
			return true;
		}else {
			return false;
		}
	}
	
}
