package chap14;

import java.util.Scanner;

public class CatchAndFinallyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CheckLogic#excuteに渡す文字列を入力してください。");
		String str = sc.nextLine();
		try {
		String result = CheckLogic.execute(str);
		System.out.println(result);
		}catch (IllegalArgumentException e) {
			System.out.println("キャッチしました。");	
		}finally {
			System.out.println("後処理です。");
		}
	
		
				}
}
