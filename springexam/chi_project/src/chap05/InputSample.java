package chap05;

import java.util.Scanner;

public class InputSample {
	static String SAMPLE = "***"; 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("１つ目の文字列を入力してください。");
		String message1=scanner.nextLine();
		System.out.println("２つ目の文字列を入力してください。");
		String message2=scanner.nextLine();
		
		String allMessage = message1 + message2;
		System.out.println(allMessage);
	}
}
