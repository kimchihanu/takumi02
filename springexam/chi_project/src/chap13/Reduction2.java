package chap13;

import java.util.Scanner;
public class Reduction2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("分子を入力してください。");
		int tuSo = Integer.parseInt(sc.nextLine());
		System.out.println("分母を入力しいてください。");
		int mauSo = Integer.parseInt(sc.nextLine());
		
		int uocChung = 1;
		for (int i = 1; i<=tuSo && i<=mauSo; i++) {
			if (tuSo%i == 0 && mauSo%i==0) {
				uocChung = i;				
			}
		}
		int tuSos = tuSo/uocChung;
		int mauSos = mauSo/uocChung;
		System.out.println("分数"+tuSo+"/"+mauSo+"を約分した結果は"+tuSos+"/"+mauSos+"です。");
		}
	}