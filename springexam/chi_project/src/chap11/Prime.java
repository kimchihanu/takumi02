package chap11;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("数値を入力してください。");
		int num = Integer.parseInt(sc.nextLine());
		String result = "";
		if (num <2){
			result = "素数ではありません。";
		}else if (num == 2) {
			result = "素数です。";
		}
		else {
			for (int i=2;i<num;i++) {
				if(num%i==0) {
					result = "素数ではありません。";
					break;
				}
				result = "素数です。";
			}
		}
		System.out.println(result);
				}
			}
