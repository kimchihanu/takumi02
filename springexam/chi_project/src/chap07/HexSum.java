package chap07;

import java.util.Scanner;

public class HexSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("１つ目の16進数を入力してください。");
		int input1 = Integer.parseInt(scanner.nextLine(),16);
		System.out.println("2つ目の16進数を入力してください。");
		int input2 = Integer.parseInt(scanner.nextLine(),16);
		int result = input1+input2;
		String resultHex = Integer.toHexString(result);
		System.out.println(resultHex);
	}

}
