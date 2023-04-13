package vn.com.vti.springexam.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.entity.BookCustomized;
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
	
	@Autowired
	private BookCustomMapper bookCustomMapper;
	
	@ModelAttribute
	public BookForm bookForm() {
		return new BookForm();
	}
	
	@RequestMapping("search")
	public String search() {
		
		return "book/search";
	}
	
	@RequestMapping("list")
	public String bookList(Model model) {
		List<BookCustomized> bookList = bookCustomMapper.selectAll();
		model.addAttribute("bookList",bookList);	
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
	public String inputConfirm (@Valid BookForm bookForm, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return input(bookForm, model);
		}
		if(bookForm.getCategoryId()!=null) {
			Category category= categoryMapper.selectByPrimaryKey(bookForm.getCategoryId());
			model.addAttribute("category", category.getCategoryName());	
		}
		if(bookForm.getPublisherId()!=null) {
			Publisher publisher= publisherMapper.selectByPrimaryKey(bookForm.getPublisherId());
			model.addAttribute("publisher", publisher.getPublisherName());	
		}	
		return "book/inputConfirm";
	}
	
	@RequestMapping("inputExecute")
	public String inputExecute (BookForm bookForm, Model model) {
		Book book = new Book();
		
		book.setBookId(bookForm.getBookId());
		book.setBookName(bookForm.getBookName());
		book.setDiscount(bookForm.getDiscount());
		book.setIsbn13(bookForm.getIsbn13());
		book.setOnSaleDate(bookForm.getOnSaleDate());
		book.setPageCount(bookForm.getPageCount());
		book.setPrice(bookForm.getPrice());
		book.setCategoryId(bookForm.getCategoryId());
		book.setPublisherId(bookForm.getPublisherId());
		
		bookMapper.insert(book);
		return "redirect:/book/list";
		
	}
	@RequestMapping("show")
	public String bookDetail(@RequestParam String bookId, Model model) {
		BookCustomized book = bookCustomMapper.selectById(bookId);
		model.addAttribute("book",book);
		return "book/show";
	}
	@RequestMapping("delete")
	public String delete(@RequestParam String bookId, Model model) {
		BookCustomized book = bookCustomMapper.selectById(bookId);
		model.addAttribute("book",book);
		return "book/delete";
	}
		
	@RequestMapping("deleteExecute")
	public String deleteExecute (@RequestParam String bookId) {	
		bookMapper.deleteByPrimaryKey(bookId);
//		int cnt = bookMapper.deleteByPrimaryKey(bookId);
//		if(cnt!=0) {
//			model.addAttribute("msg","削除完了しました。");
//			}model.addAttribute("msg","書籍は存在しません。");
			
		return "redirect:/book/list";
	}
	@RequestMapping("edit")
	public String edit (@RequestParam String bookId,BookForm bookForm, Model model) {
		Book book = bookMapper.selectByPrimaryKey(bookId);
		bookForm.setBookId(book.getBookId());
		bookForm.setBookName(book.getBookName());
		bookForm.setDiscount(book.getDiscount());
		bookForm.setIsbn13(book.getIsbn13());
		bookForm.setOnSaleDate(book.getOnSaleDate());
		bookForm.setPageCount(book.getPageCount());
		bookForm.setPrice(book.getPrice());
		bookForm.setCategoryId(book.getCategoryId());
		bookForm.setPublisherId(book.getPublisherId());
				
		CategoryExample categoryExample = new CategoryExample();
		categoryExample.setOrderByClause("category_id");
		List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
		model.addAttribute("categoryList",categoryList);
		
		PublisherExample publisherExample = new PublisherExample();
		publisherExample.setOrderByClause("publisher_id");
		List<Publisher> publisherList = publisherMapper.selectByExample(publisherExample);
		model.addAttribute("publisherList",publisherList);

		return "book/edit";
}
	@RequestMapping("editConfirm")
	public String editConfirm (@Valid BookForm bookForm,BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return input(bookForm, model);
		}
		if(bookForm.getCategoryId()!=null) {
			Category category= categoryMapper.selectByPrimaryKey(bookForm.getCategoryId());
			model.addAttribute("category", category);	
		}
		if(bookForm.getPublisherId()!=null) {
			Publisher publisher= publisherMapper.selectByPrimaryKey(bookForm.getPublisherId());
			model.addAttribute("publisher", publisher);	
		}
		return "book/editConfirm";
}
	@RequestMapping("editExecute")
	public String editExecute (BookForm bookForm, Model model) {
	Book book = new Book();
	
	book.setBookId(bookForm.getBookId());
	book.setBookName(bookForm.getBookName());
	book.setDiscount(bookForm.getDiscount());
	book.setIsbn13(bookForm.getIsbn13());
	book.setOnSaleDate(bookForm.getOnSaleDate());
	book.setPageCount(bookForm.getPageCount());
	book.setPrice(bookForm.getPrice());
	book.setCategoryId(bookForm.getCategoryId());
	book.setPublisherId(bookForm.getPublisherId());
	
	bookMapper.updateByPrimaryKey(book);
	
	return "redirect:/book/list";
	}
}
//}
//	@RequestMapping("bookpage")
//	public String bookPage (Model model) {
//		BookExample bookExample = new BookExample();
//		bookExample.createCriteria();
//		List<Book> bookList = bookMapper.selectByExample(bookExample);
//		
//		model.addAttribute("bookList", bookList);
//	
//		return "book/bookpage";	
//	}
//	@RequestMapping("list")
//	public String listBook(Model model) {
//		BookExample bookExample = new BookExample();
//		bookExample.createCriteria();
//		List<Book> bookList = bookMapper.selectByExample(bookExample);
//
//		model.addAttribute("bookList", bookList);
//	
//		return "book/list";}

//	@Autowired
//	private BookCustomMapper bookCustomMapper;
//	
//	@RequestMapping("nameSearchResult")
//	public String searchByName(@RequestParam String bookName, Model model) {
//		List<BookCustomized> bookList = bookCustomMapper.selectByNamePart("%"+bookName+"%");
//		model.addAttribute("bookList",bookList);
//		return "book/nameSearchResult";		
//	@RequestMapping("idSearchResult")
//	public String searchById(@RequestParam String bookId, Model model) {
//		List<BookCustomized> bookList = bookCustomMapper.selectById(bookId);
//		model.addAttribute("bookList",bookList);
//		return "book/idSearchResult";