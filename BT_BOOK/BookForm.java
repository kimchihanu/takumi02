package vn.com.vti.springexam.form;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookForm {
	@NotBlank
	private String bookId;
	
	@NotBlank
	private String bookName;
	
	@NotNull
	private Integer price;
	
	@NotNull
	private Integer discount;
	
	@NotNull
	private Integer pageCount;
	
	@NotNull
	private String isbn13;
	
	
	@NotNull
	@DateTimeFormat(pattern="yyyy年MM月dd日")
	private Date onSaleDate;
	
	@NotBlank
	private String categoryId;
	private String categoryName;
	
	@NotBlank
	private String publisherId;
	private String publisherName;
	

	
	
		
}	
	
