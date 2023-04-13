//package vn.com.vti.springexam.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import vn.com.vti.springexam.entity.Book;
//import vn.com.vti.springexam.entity.BookCustomized;
//import vn.com.vti.springexam.entity.Category;
//import vn.com.vti.springexam.entity.CategoryExample;
//import vn.com.vti.springexam.entity.Publisher;
//import vn.com.vti.springexam.entity.PublisherExample;
//import vn.com.vti.springexam.form.BookForm;
//import vn.com.vti.springexam.mapper.BookCustomMapper;
//import vn.com.vti.springexam.mapper.BookMapper;
//import vn.com.vti.springexam.mapper.CategoryMapper;
//import vn.com.vti.springexam.mapper.PublisherMapper;
//
//@Controller
//@RequestMapping("book2")
//public class BookController2 {
//	@Autowired
//	private BookMapper bookMapper;
//	
//	@Autowired
//	private CategoryMapper categoryMapper;
//	
//	@Autowired
//	private PublisherMapper publisherMapper;
//	
//	@Autowired
//	private BookCustomMapper bookCustomMapper;
//	
//	@ModelAttribute
//	public BookForm bookForm() {
//		return new BookForm();
//	}
//	
//	@RequestMapping("list")
//	public String bookList(Model model) {
//		List<BookCustomized> bookList = bookCustomMapper.selectById();
//		model.addAttribute("bookList",bookList);	
//		return "book/list";
//}
//	@RequestMapping("input")
//	public String input(BookForm bookForm, Model model) {
//		
//		CategoryExample categoryExample = new CategoryExample();
//		categoryExample.setOrderByClause("category_id");
//		List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
//		model.addAttribute("categoryList",categoryList);
//		
//		PublisherExample publisherExample = new PublisherExample();
//		publisherExample.setOrderByClause("publisher_id");
//		List<Publisher> publisherList = publisherMapper.selectByExample(publisherExample);
//		model.addAttribute("publisherList",publisherList);
//		
//		return "book/input";
//	}
//	@RequestMapping("inputConfirm")		
//	public String inputConfirm (@Valid BookForm bookForm, BindingResult bindingResult, Model model) {
//		if (bindingResult.hasErrors()) {
//			return input(bookForm, model);
//		}
//		if(bookForm.getCategoryId()!=null) {
//			Category category= categoryMapper.selectByPrimaryKey(bookForm.getCategoryId());
//			model.addAttribute("category", category);	
//		}
//		if(bookForm.getPublisherId()!=null) {
//			Publisher publisher= publisherMapper.selectByPrimaryKey(bookForm.getPublisherId());
//			model.addAttribute("publisher", publisher);	
//		}	
//		return "book/inputConfirm";
//}
//	@RequestMapping("detail")
//	public String update (@RequestParam String bookId,BookForm bookForm, Model model) {
//	Book book = bookMapper.selectByPrimaryKey(bookId);
//	bookForm.setBookId(book.getBookId());
//	bookForm.setBookName(book.getBookName());
//	
//	CategoryExample categoryExample = new CategoryExample();
//	categoryExample.setOrderByClause("category_id");
//	List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
//	model.addAttribute("categoryList",categoryList);
//	
//	PublisherExample publisherExample = new PublisherExample();
//	publisherExample.setOrderByClause("publisher_id");
//	List<Publisher> publisherList = publisherMapper.selectByExample(publisherExample);
//	model.addAttribute("publisherList",publisherList);
//		return "book/detail";
//	}
//}
//	