package chap10;

import java.util.Scanner;

public class JudgeScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("点数を入力してください。");
		int score = Integer.parseInt(sc.nextLine());
		String result = null;
		if (score >=80) {
			result = "合格";
		}else {
			result = "不合格";
		}
		System.out.println(result);
	}

}
