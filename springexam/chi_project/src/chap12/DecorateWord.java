package chap12;

import java.util.Scanner;

public class DecorateWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("文字列を入力してください。");
		String input = sc.nextLine();
		
		String[] datas = input.split(",");
		String ch = "***";
		for (String data:datas) {
			System.out.println(ch+data+ch);
		}
		
		
	}

}
