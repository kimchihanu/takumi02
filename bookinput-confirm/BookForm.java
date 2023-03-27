package vn.com.vti.springexam.form;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookForm {
	@NotNull
	private String bookId;
	@NotBlank
	private String bookName;
	@NotNull
	private Integer price;
	
	private Integer discount;
	
	private Integer pageCount;
	
	private String isbn13;
	
	private Date onSaleDate;
	
	private String categoryId;
	
	private String publisherId;
	
//	private List<Category> categoryList = new ArrayList<Category>();
//	
//	private List<Publisher> publisherList = new ArrayList<Publisher>();
	
		
}	
	
