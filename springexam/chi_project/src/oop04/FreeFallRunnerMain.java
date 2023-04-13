package oop04;

import java.util.Scanner;

public class FreeFallRunnerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("秒数を入力してください。");
		int sec = Integer.parseInt(sc.nextLine());
		System.out.println("重力加速度（m/s2）を入力してください。（地球の重力速度でよい場合は空文字）");
		String gforce = sc.nextLine();
	
		
		FreeFallRunner freefallrunner = null;
		if (gforce.isEmpty()) {
			freefallrunner = new FreeFallRunner();
		}else {
			freefallrunner = new FreeFallRunner(gforce);			
		}
		System.out.println(sec+"秒後の落下速度は"+freefallrunner.vToc(sec)+"km/hです。"+freefallrunner.Kcach(sec)+"m落下しました。");
		}
	}
