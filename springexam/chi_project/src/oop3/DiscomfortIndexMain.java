package oop3;

import java.util.Scanner;

public class DiscomfortIndexMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("気温を入力してくだい。");
		int temperature = Integer.parseInt(sc.nextLine());
		System.out.println("湿度を入力してくだい。");
		int humidity = Integer.parseInt(sc.nextLine());
		
		DiscomfortIndex discomfortIndex = new DiscomfortIndex (temperature, humidity);
		
		System.out.println("不快数値:"+discomfortIndex.indexValue());
		System.out.println("体感:"+discomfortIndex.feel());
		
	}

}