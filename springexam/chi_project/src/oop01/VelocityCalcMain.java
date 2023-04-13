package oop01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VelocityCalcMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List<Input> divideUnitList = new ArrayList<>();
		Input data = new Input();
		System.out.println("距離を単位付きで入力してください。");
		String distanceStr = sc.nextLine();
		System.out.println("時間を単位付きで入力してください。");
		String timeStr = sc.nextLine();
		
		//process
		Input distance = divideUnit(distanceStr);//tao doi tuong distance, goi cac ham de xu ly lay unit
		Input time = divideUnit(timeStr);//tao doi tuong time, goi cac ham de xu ly lay num
		
		int velocity = distance.getNum()/time.getNum();
		
		//output
		StringBuilder builder = new StringBuilder();
		builder.append("速度は");
		builder.append(velocity);
		builder.append(distance.getUnit());
		builder.append("/");
		builder.append(time.getUnit());
		builder.append("です。");
		System.out.println(builder.toString());
		
	}
	private static Input divideUnit(String str) {
		String num = "";
		String unit ="";
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if (isNumber(c)) {
				num+=c;
			}else {
				unit +=c;
				
			}
		}
		Input distance = new Input();
		distance.setNum(Integer.parseInt(num));
		distance.setUnit(unit);
		return distance;
		
	}
	private static boolean isNumber (char c) {
				return c>='0'&&c<='9';
		}

}
