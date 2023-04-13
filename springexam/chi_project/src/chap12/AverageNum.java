package chap12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List<Integer> numbers = new ArrayList<Integer>();
		String input =null;
		
		while (true) {
		System.out.println("数値を入力するか\"RESULT\"と入力してください");
		input = sc.nextLine();
		if (input.equals("RESULT")){
		break;
		}int num = Integer.parseInt(input);
		numbers.add(num);
		}
		int sum = 0;
		for (Integer num:numbers) {
			sum += num.intValue();
		}
		BigDecimal Sum = new BigDecimal(sum);
		BigDecimal Lenght = new BigDecimal(numbers.size());
		BigDecimal Average = Sum.divide(Lenght,1, BigDecimal.ROUND_HALF_UP);
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<numbers.size();i++) {
			if (i>0) {
				result.append("、");
			}
			result.append(numbers.get(i));
		}
		result.append("の平均は");
		result.append(Average.toString());
		result.append("です。");
		
		System.out.println(result.toString());
		
	}

}
