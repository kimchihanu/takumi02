package chap06;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("底辺を入力してください。");
		int bottom = Integer.parseInt(sc.nextLine());
		System.out.println("高さを入力してください。");
		int height = Integer.parseInt(sc.nextLine());
		int result = (bottom * height)/2;
		System.out.println("面積は"+result+"です。");
	}

}
