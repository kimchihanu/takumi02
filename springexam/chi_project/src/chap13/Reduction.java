package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Reduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("分子を入力してください。");
		int tuSo = Integer.parseInt(sc.nextLine());
		System.out.println("分母を入力しいてください。");
		int mauSo = Integer.parseInt(sc.nextLine());
		
		int Snum = Math.min(tuSo,mauSo);
		int Bnum =Math.max(tuSo,mauSo);
		int uocChung = 0;
		List<Integer> uocSo = getDiviable(Snum);
		for (Integer e :uocSo) {
			if(Bnum%e==0){
				uocChung = e;
				break;									
			}
			}
			int tuSos = tuSo/uocChung;
			int mauSos = mauSo/uocChung;
			System.out.println("分数"+tuSo+"/"+mauSo+"を約分した結果は"+tuSos+"/"+mauSos+"です。");			
			}	
		private static List<Integer>getDiviable (int a){
			List<Integer> diviableList = new ArrayList<Integer>();
			for(int i=a; i>=2; i--) {
				if(a%i==0) {
					diviableList.add(i);
					}
				}
			return diviableList;
		}
}
