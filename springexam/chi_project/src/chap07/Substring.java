package chap07;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("文字列を入力してください。");
		String str1 = sc.nextLine();
		System.out.println("開始位置を入力してください。");
		int startStr = Integer.parseInt(sc.nextLine());
		System.out.println("文字数を入力してください。");
		int Num = Integer.parseInt(sc.nextLine());
		String str2 = str1.substring(startStr-1, Num+1);
		System.out.println(str2);
	}

}
