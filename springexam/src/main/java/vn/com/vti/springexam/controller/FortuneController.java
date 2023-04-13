package vn.com.vti.springexam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fortune")
public class FortuneController {
	@RequestMapping(value = "/index",produces="text/html; charset=utf-8")
	@ResponseBody
	
	public String index() {
	List<String>listStr = new ArrayList();
	listStr.add("Lucky!");
	listStr.add("Normal!");
	listStr.add("Bad!");
	
	String rs = null;
	Random rd = new Random();
	for(int i=0; i < listStr.size(); i++){
		rs= listStr.get(rd.nextInt(listStr.size()));
		System.out.println(rs);
	}
	String result = "";
	result +="<html>";
	result +="<head><meta charset=\"UTF-8\"></head>";
	result +="<body>";
	result +="<p>";
	result +=rs;
	result +="</p>";
	result +="</html>";
	return result;

	}
}
