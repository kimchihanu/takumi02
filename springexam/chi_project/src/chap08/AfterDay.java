package chap08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AfterDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("日数を入力してください。");
		String dateCount = sc.nextLine();
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR,2014);
		calendar.set(Calendar.MONTH,0);
		calendar.set(Calendar.DATE,1);
		
		calendar.add(Calendar.DATE,Integer.parseInt(dateCount));
		
		Date date = calendar.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		String dateString = dateFormat.format(date);
		System.out.println(dateString);
		
		
	}
}
