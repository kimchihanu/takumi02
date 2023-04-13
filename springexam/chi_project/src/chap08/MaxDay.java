package chap08;

import java.util.Calendar;
import java.util.Scanner;

public class MaxDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("年を入力してください。");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("月を入力してください。");
		int month = Integer.parseInt(sc.nextLine());
		
		Calendar c = Calendar.getInstance();
		c.clear();
		c.set(year,month-1,1);
		int maxDay = c.getActualMaximum(Calendar.DATE);

		System.out.println(maxDay);
	}}