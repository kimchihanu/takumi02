package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.entity.BookCustomized;
import vn.com.vti.springexam.entity.BookExample;
import vn.com.vti.springexam.entity.Category;
import vn.com.vti.springexam.entity.CategoryExample;
import vn.com.vti.springexam.entity.Publisher;
import vn.com.vti.springexam.entity.PublisherExample;
import vn.com.vti.springexam.form.BookForm;
import vn.com.vti.springexam.mapper.BookCustomMapper;
import vn.com.vti.springexam.mapper.BookMapper;
import vn.com.vti.springexam.mapper.CategoryMapper;
import vn.com.vti.springexam.mapper.PublisherMapper;

@Controller
@RequestMapping("book")
public class BookController {
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private PublisherMapper publisherMapper;
	
	@ModelAttribute
	public BookForm bookForm() {
		return new BookForm();
	}
	
	@RequestMapping("search")
	public String search() {
		
		return "book/search";
	}
	
	@RequestMapping("bookpage")
	public String bookPage (Model model) {
		BookExample bookExample = new BookExample();
		bookExample.createCriteria();
		List<Book> bookList = bookMapper.selectByExample(bookExample);
		
		model.addAttribute("bookList", bookList);
	
		return "book/bookpage";	
	}
	@RequestMapping("list")
	public String listBook(Model model) {
		BookExample bookExample = new BookExample();
		bookExample.createCriteria();
		List<Book> bookList = bookMapper.selectByExample(bookExample);
		
		model.addAttribute("bookList", bookList);
	
		return "book/list";
}
	@RequestMapping("input")
	public String input(BookForm bookForm, Model model) {
	
		CategoryExample categoryExample = new CategoryExample();
		categoryExample.setOrderByClause("category_id");
		List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
		model.addAttribute("categoryList",categoryList);
		
		PublisherExample publisherExample = new PublisherExample();
		publisherExample.setOrderByClause("publisher_id");
		List<Publisher> publisherList = publisherMapper.selectByExample(publisherExample);
		model.addAttribute("publisherList",publisherList);
		
		return "book/input";
	}
	@RequestMapping("inputConfirm")
	public String inputConfirm (BookForm bookForm, Model model) {
		if(bookForm.getCategoryId()!=null) {
			Category category= categoryMapper.selectByPrimaryKey(bookForm.getCategoryId());
			model.addAttribute("category", category);	
		}
		if(bookForm.getPublisherId()!=null) {
			Publisher publisher= publisherMapper.selectByPrimaryKey(bookForm.getPublisherId());
			model.addAttribute("publisher", publisher);	
		}	
		return "book/inputConfirm";
}

	@Autowired
	private BookCustomMapper bookCustomMapper;
	
	@RequestMapping("nameSearchResult")
	public String searchByName(@RequestParam String bookName, Model model) {
		List<BookCustomized> bookList = bookCustomMapper.selectByNamePart("%"+bookName+"%");
		model.addAttribute("bookList",bookList);
		return "book/nameSearchResult";
			
	}
	@RequestMapping("idSearchResult")
	public String searchById(@RequestParam String bookId, Model model) {
		List<BookCustomized> bookList = bookCustomMapper.selectById(bookId);
		model.addAttribute("bookList",bookList);
		return "book/idSearchResult";
}
}