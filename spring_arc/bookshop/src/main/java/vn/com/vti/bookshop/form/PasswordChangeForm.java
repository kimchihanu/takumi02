package vn.com.vti.bookshop.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PasswordChangeForm {
	@NotBlank
	@Size(min = 6, message = "{error.passwordLength}")
	private String password1;
	@NotBlank
	private String password2;

	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

}
