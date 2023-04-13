package oop3;

import java.util.Scanner;

	public class ParttimerMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("時給を入力してください。");
			int hourlyRate = Integer.parseInt(sc.nextLine());
			System.out.println("勤務時間を入力してください。");
			int workHour = Integer.parseInt(sc.nextLine());
			
			Parttimer parttimer = new Parttimer (hourlyRate,workHour);
			 System.out.println("給料額は"+parttimer.salary()+"円");
}
}