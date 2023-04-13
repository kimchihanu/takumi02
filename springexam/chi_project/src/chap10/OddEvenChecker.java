package chap10;

import java.util.Scanner;

public class OddEvenChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int num = Integer.parseInt(sc.nextLine());
		int check = num%2;
		String result = null;
		if (check == 0){
			result = "偶数です";}
		else {
			result = "奇数です";}
		System.out.println(result);	
		}
	}
