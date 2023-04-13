package chap12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSummary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値の個数を入力してください。");
		int num = Integer.parseInt(sc.nextLine());
		
		List<Integer> numbers = new ArrayList<Integer>();// khai bao
		for (int i=1; i<=num;i++) {
			System.out.println(i + "個目の数値を入力してください。");
			Integer nummber = Integer.valueOf(sc.nextLine());
			numbers.add(nummber);// them 1 gia tri vao list
			
		}
		int summary = 0;
		for (Integer n: numbers) {
			summary +=n.intValue();
			
		}
		System.out.println(summary);
	}

}
