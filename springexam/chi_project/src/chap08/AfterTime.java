package chap08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AfterTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("分を入力してください。");
		String input = sc.nextLine();
		
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.HOUR_OF_DAY,00 );
		calendar.set(Calendar.MINUTE,0);
		calendar.add(Calendar.MINUTE,Integer.parseInt(input));
		
		Date hour = calendar.getTime();
		SimpleDateFormat hourFormat = new SimpleDateFormat("hh:mm");
		String hourString = hourFormat.format(hour);
		System.out.println(hourString);
		
		
	
		
	}
}
