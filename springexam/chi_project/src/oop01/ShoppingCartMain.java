package oop01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<ShoppingCart> itemList = new ArrayList<ShoppingCart>();
		while(true) {
			ShoppingCart item = new ShoppingCart();
			System.out.println("商品名を入力してください。");
			item.setName(sc.nextLine());
			System.out.println("単価を入力してください。");
			item.setPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("購入数を入力してください。");
			item.setNum(Integer.parseInt(sc.nextLine()));
			itemList.add(item);
			System.out.println("他の商品を購入しますか?(y/n)");
			String answer = sc.nextLine();
			if (answer.equals("n")) {
				break;
			}
		}
			int totalPrice = 0;
		for (ShoppingCart e:itemList) {
			totalPrice += e.getTotal();
		}
			for(ShoppingCart e:itemList) {
				System.out.println(e.getName()+"x"+e.getNum()+"："+e.getTotal()+"円");
			}
				System.out.println("合計 "+totalPrice+"円");
			}
			
}
