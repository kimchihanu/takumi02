package oop04;

import java.util.Scanner;

public class SalesTaxMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("小計を入力してください。");
		int priceTotal = Integer.parseInt(sc.nextLine());
		System.out.println("税率を入力してください。（空文字でデフォルトの税率）");
		String rate = sc.nextLine();
		
		SalesTax salesTax = new SalesTax(priceTotal);
		Integer tax = null;//tao bien tham chieu
		if (rate.isEmpty()) {
			tax = salesTax.amountOfTax();
		} else {
			tax = salesTax.amountOfTax(Integer.parseInt(rate));
			}
		System.out.println("消費税額は"+tax+"円です。");
		}
	}

