package vn.com.vti.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.vti.bookshop.entity.Book;
import vn.com.vti.bookshop.entity.BookExample;
import vn.com.vti.bookshop.mapper.BookMapper;

@Controller
public class SearchController {
	@Autowired
	private BookMapper bookMapper;
	
	@RequestMapping(value = "search",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Book> search(@RequestParam("bookName")String bookName) {
		BookExample bookExample = new BookExample();
		bookExample.createCriteria().andBookNameLike("%"+bookName+"%");
		List<Book> bookList = bookMapper.selectByExample(bookExample);
		
		return bookList;
	}
	@RequestMapping("search-result")
	public String searchResult() {
		return "search/searchResult";
	}

}
