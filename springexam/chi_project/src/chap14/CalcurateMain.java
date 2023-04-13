package chap14;

import java.util.Scanner;

public class CalcurateMain {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("数値を入力してください。");
  String str = scanner.nextLine();
  Integer num = null;
  if(!str.isEmpty()){
   num = Integer.valueOf(str);
  }
	try {
		int result = Calcurate.divideThousand(num);
	} catch (MinusException e) {
		System.out.println("負の値を入力しないでください。");
	} catch (ArithmeticException e) {
		System.out.println("ゼロを入力しないでください。");
	} catch (NullPointerException e) {
		System.out.println("値が入力されていません。");
	}
 }
//System.out.println(result);
}
