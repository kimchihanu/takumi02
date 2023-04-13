package chap05;

import java.util.Scanner;

public class CallName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("名字を入力してください。");
		String lastName = scanner.nextLine();
		System.out.println("名前を入力してください。");
		String firstName = scanner.nextLine();
		System.out.println("こんにちは"+lastName+firstName+"さん。今回は"+firstName+"と呼んでいいですか？");
		
	}

}
