package chap06;

import java.util.Scanner;

public class SecondMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("秒数を入力してください。");
		int sec1 = Integer.parseInt(sc.nextLine());
		int hour= sec1/3600;
		int min=(sec1%3600)/60;
		int sec2=(sec1%3600)%60;
		System.out.println(hour+"時間"+min+"分"+sec2+"秒");
	}
}
