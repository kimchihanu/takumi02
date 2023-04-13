package chap10;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BmiChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("身長を入力してください。");
		BigDecimal height = new BigDecimal(sc.nextLine());
		
		System.out.println("体重を入力してください。");
		BigDecimal weight = new BigDecimal(sc.nextLine());
		
		BigDecimal Hundred = new BigDecimal("100");
		BigDecimal heightM = height.divide(Hundred);
		BigDecimal bmi = weight.divide(heightM.multiply(heightM),1,RoundingMode.DOWN);
		
		double Bmi = bmi.doubleValue();
		String result =null;
		if (Bmi<18.5) {
			result = "低体重";
			}
		else if (Bmi >=18.5 && Bmi<25) {
			result = "普通体重";
			}
		else {
			result = "肥満";
		}
		
		System.out.println("BMI指数:"+Bmi+" "+"肥満度："+result);
	}
}
