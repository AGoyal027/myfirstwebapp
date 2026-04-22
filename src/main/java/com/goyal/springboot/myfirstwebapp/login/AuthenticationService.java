package com.goyal.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("tcs bancs");
		boolean isValidPassword = password.equalsIgnoreCase("ChangePWd");
		
		return isValidUserName && isValidPassword;
	}

}
