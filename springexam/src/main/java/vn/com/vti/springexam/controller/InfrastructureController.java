package vn.com.vti.springexam.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.InsfraForm;

@Controller
@RequestMapping("insfrastructure")
public class InfrastructureController {
	@ModelAttribute
	public InsfraForm createForm() {
		return new InsfraForm();
	}
	
	@RequestMapping("input")
	public String input(InsfraForm insfraForm) {
		return "insfrastructure/input";
	}
	
	@RequestMapping("inputConfirm")
	public String inputConfirm(@Valid InsfraForm insfraForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return input(insfraForm);
		}
		
		return "insfrastructure/inputConfirm";
	}
}
