package chap13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DisplayYen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("金額を入力してください。");
		int price = Integer.parseInt(sc.nextLine());
		
		String formatString = formatToYen(price);
		System.out.println(formatString);
	}
	private static String formatToYen(int priceInput) {
		NumberFormat nf = new DecimalFormat("\\,##0");
		
		return nf.format(priceInput);
		
	}
}
