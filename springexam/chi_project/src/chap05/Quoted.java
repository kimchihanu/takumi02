package chap05;

import java.util.Scanner;

public class Quoted {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("文字列を入力してください。");
			String str = scanner.nextLine();
			System.out.println("'"+str+"'");
			System.out.println("\""+str+"\"");
		
		
	}
}
