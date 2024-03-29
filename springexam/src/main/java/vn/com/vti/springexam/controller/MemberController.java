package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.MemberCustomized;
import vn.com.vti.springexam.mapper.MemberCustomMapper;

@Controller
@RequestMapping("member")
public class MemberController {
	@RequestMapping("search")
	public String search() {
		
		return "member/search";
}
	
	@Autowired
	private MemberCustomMapper memberCustomMapper;
	
	@RequestMapping("nameSearchResult")
	public String searchByName(@RequestParam String name, Model model) {
		List<MemberCustomized> memberList = memberCustomMapper.selectByNamePart("%"+name+"%");
		model.addAttribute("memberList",memberList);
		return "member/nameSearchResult";
		
}
}
