package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Publisher;
import vn.com.vti.springexam.entity.PublisherExample;
import vn.com.vti.springexam.mapper.PublisherMapper;

@Controller
@RequestMapping("publisher")
public class PublisherController {
	@Autowired
	private PublisherMapper publisherMapper;
	//input // publisher/search// jsp: publisher/searchInput
	@RequestMapping("search")
	public String search() {
		
		return "publisher/searchInput";
	}
	
	//output// publisher/searchResult// jsp: publisher/searchResult
	
	@RequestMapping("searchResult")
	public String searchResult(@RequestParam("publisherId")String publisherId, Model model) {
		Publisher publisher = publisherMapper.selectByPrimaryKey(publisherId);
		model.addAttribute("publisher", publisher);
	
		return "publisher/searchResult";
	}
	//publisher/list  jsp:publisher/list
	@RequestMapping("list")
	public String listPublisher(Model model) {
		PublisherExample publisherExample = new PublisherExample();
		publisherExample.createCriteria();
		List<Publisher> publishers = publisherMapper.selectByExample(publisherExample);
		
		model.addAttribute("publishers", publishers);
	
		return "publisher/list";
}
}