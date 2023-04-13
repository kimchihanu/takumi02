package chap06;

import java.math.BigDecimal;
import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("底辺を入力してください。");
		BigDecimal bottom = new BigDecimal((sc.nextLine()));
		System.out.println("底辺を入力してください。");
		BigDecimal height = new BigDecimal((sc.nextLine()));
		BigDecimal two = new BigDecimal("2");
		
		BigDecimal area = bottom.multiply(height).divide(two);
		
		System.out.println("面積は"+area.toPlainString()+"です。");
		
	}

}
