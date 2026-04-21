package com.goyal.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	// Passing as a query parameter in request
	@RequestMapping("login")
	public String gotoLoginPage() {

		return "Login";
	}

}
