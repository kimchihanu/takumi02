package chap075;

import java.util.Scanner;

public class NextChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("文字を１文字入力してください。");
		String ch = sc.nextLine();
		char ch1 = ch.charAt(0);
		char ch2 = (char)(ch1+1);
		System.out.println("文字"+"「"+ch+"」"+"次の文字は"+"「"+ch2+"」"+"です。");
		
	}

}
