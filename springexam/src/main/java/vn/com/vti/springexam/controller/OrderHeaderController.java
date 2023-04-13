package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.OrderHeader;
import vn.com.vti.springexam.entity.OrderHeaderExample;
import vn.com.vti.springexam.mapper.OrderHeaderMapper;

@Controller
@RequestMapping("orderheader")
public class OrderHeaderController {
	@Autowired
	private OrderHeaderMapper orderheaderMapper;
	@RequestMapping("search")
	public String search() {
		
		return "orderheader/searchInput";
	}
	
	@RequestMapping("searchResult")
	public String searchResult(@RequestParam("orderNo")String orderNo, Model model) {
		OrderHeader orderheader = orderheaderMapper.selectByPrimaryKey(orderNo);
		model.addAttribute("orderheader", orderheader);
	
		return "orderheader/searchResult";
	}

	@RequestMapping("list")
	public String ohInfor(Model model) {
		OrderHeaderExample ohExample = new OrderHeaderExample();
		ohExample.createCriteria();
		List<OrderHeader> oh = orderheaderMapper.selectByExample(ohExample);
		
		model.addAttribute("ohList", oh);
	
		return "orderheader/list";
}
}