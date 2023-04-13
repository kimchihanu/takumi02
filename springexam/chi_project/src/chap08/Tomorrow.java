package chap08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tomorrow {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner (System.in);
		System.out.println("年月日を入力してください。");
		//yyyy/MM/dd
		String ymd = sc.nextLine();
		
//		Process
//		chuyen String => calendar
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		//"2014/01/32"/
		Date date = dateFormat.parse(ymd);

		Calendar calendar = Calendar.getInstance();//Khoi tao
		calendar.clear();
		calendar.setTime(date);//set thoi gian cho date phia tren
		calendar.add(Calendar.DATE,1);
		
		//Output
		SimpleDateFormat outFormat = new SimpleDateFormat("yyyy年M月d日です。");
		System.out.println(outFormat.format(calendar.getTime()));
		
	}
}
