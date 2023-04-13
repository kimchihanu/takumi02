package chap06;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1つ目の数値を入力してください。");
		int num1= Integer.parseInt(sc.nextLine());
		System.out.println("2つ目の数値を入力してください。");
		int num2= Integer.parseInt(sc.nextLine()); 
		
		int result = num1 + num2;
			//result + = 5 //result = result + 5
		System.out.println("足し算の結果は"+result);
		
	
	}

}
