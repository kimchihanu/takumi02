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
		
		return "book/searchInput";
	}
	
	
	@RequestMapping("searchResult")
	public String searchResult(@RequestParam("bookId")String bookId, Model model) {
		Book book = bookMapper.selectByPrimaryKey(bookId);
		model.addAttribute("book", book);
	
		return "book/searchResult";
	}
	
	@RequestMapping("list")
	public String listBook(Model model) {
		BookExample bookExample = new BookExample();
		bookExample.createCriteria();
		List<Book> books = bookMapper.selectByExample(bookExample);
		
		model.addAttribute("bookList", books);
	
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
	@RequestMapping("updateExecute")
	public String updateExecute (BookForm bookForm, Model model) {
	Book book = new Book();
	
	book.setBookId(bookForm.getBookId());
	book.setBookName(bookForm.getBookName());
	book.setCategoryId(bookForm.getCategoryId());
	book.setDiscount(bookForm.getDiscount());
	book.setIsbn13(bookForm.getIsbn13());
	book.setOnSaleDate(bookForm.getOnSaleDate());
	book.setPageCount(bookForm.getPageCount());
	book.setPrice(bookForm.getPrice());
	book.setPublisherId(bookForm.getPublisherId());
	
	bookMapper.updateByPrimaryKey(book);
	
	return "redirect:./input";
	}
	@Autowired
	private BookCustomMapper bookCustomMapper;
	
	@RequestMapping("search-by-name")
	public String searchByName(@RequestParam String bookName, Model model) {
		List<BookCustomized> bookList = bookCustomMapper.selectByNamePart("%"+bookName+"%");
		model.addAttribute("bookList",bookList);
		return "book/bookSearchResult";
		
		
	}
	
}
//public String input (@RequestParam String bookId,BookForm bookForm, Model model) {
//Book book = bookMapper.selectByPrimaryKey("bookId");
//bookForm.setBookId(book.getBookId());
//bookForm.setBookName(book.getBookName());
//bookForm.setPrice(book.getPrice());
//bookForm.setDiscount(book.getDiscount());
//bookForm.setCategoryId(book.getCategoryId());
//bookForm.setPublisherId(book.getPublisherId());
//bookForm.setPageCount(book.getPageCount());
//bookForm.setIsbn13(book.getIsbn13());
//bookForm.setOnSaleDate(book.getOnSaleDate());
//