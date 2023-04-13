package chap075;

import java.util.Scanner;

public class LastWordMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("文字列を入力してください。");
		String str1 = sc.nextLine();
		System.out.println("末尾の文字を入力してください。");
		String str2 = sc.nextLine();
		if (str1.endsWith(str2)) {
		System.out.println("true");
		}else {
		System.out.println("false");	
		}
		}
		
		
	}
