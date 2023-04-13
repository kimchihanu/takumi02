package chap07;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("文字列を入力してください。");
		String str = scanner.nextLine();
		int strLenght = str.length();
		str.toLowerCase().length();
		System.out.println("文字数は"+strLenght);

	}

}
