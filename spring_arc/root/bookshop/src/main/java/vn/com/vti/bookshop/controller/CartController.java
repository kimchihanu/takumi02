package vn.com.vti.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vn.com.vti.bookshop.dto.CartDto;
import vn.com.vti.bookshop.entity.Book;
import vn.com.vti.bookshop.mapper.BookMapper;

@Controller
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartDto cartDto;

	@Autowired
	private BookMapper bookMapper;

	@RequestMapping("/add")
	public String add(Integer bookId, RedirectAttributes redirectAttributes) {
		Book book = bookMapper.selectByPrimaryKey(bookId);

		//カートに書籍を追加
		cartDto.getBookList().add(book);

		redirectAttributes.addFlashAttribute("message", "カートに追加しました。");
		return "redirect:/";
	}

	@RequestMapping("/index")
	public String index() {
		return "cart/cartIndex";
	}

	@RequestMapping("/delete")
	public String delete(Integer cartIndex, RedirectAttributes redirectAttributes) {
		//カートの書籍を削除
		cartDto.getBookList().remove(cartIndex.intValue());
		
		redirectAttributes.addFlashAttribute("message", "カートから削除しました。");
		return "redirect:/cart/index";
	}
}
