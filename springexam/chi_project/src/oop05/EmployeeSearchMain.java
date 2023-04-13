package oop05;

import java.util.Scanner;

public class EmployeeSearchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("検索したい社員番号を入力してください。");
		String searchNo = scanner.nextLine();
		//TODO ２．インスタンス生成の切り替え
		EmployeSearchServiceImpl service = new EmployeSearchServiceImpl();
		Employee employee = service.searchByNo(searchNo);
		//TODO １．出力処理
		if (employee!=null) {
			StringBuilder builder = new StringBuilder();
			builder.append("社員番号");
			builder.append(searchNo);
			builder.append("の社員名は");
			builder.append(employee.getName());
			builder.append("です。");
			System.out.println(builder.toString());
		}else {
			System.out.println("該当する社員は存在しません。");
		}
			
	}
		}
