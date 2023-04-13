package chap10;

import java.util.Scanner;

public class SeasonChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("月を入力してください。");
		String input = sc.nextLine();
		String month = input.replace("月","");
		int m = Integer.parseInt(month);
		String hot = "猛暑です。";
		String cold = "極寒です。";
		switch(m) {
		case 3:// case 1,2,3:
		case 4:
		case 5:
			System.out.println("春です。");
			break;
		case 6:
		case 7:
			System.out.println("夏です。");
			break;
		case 8:System.out.println("夏です。"+hot);
		break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋です。");
		break;
		case 12:
		System.out.println("冬です。"+cold);
		break;
		default:
		case 1:
		case 2:
		System.out.println("冬です。");
		
		}
	}

}
