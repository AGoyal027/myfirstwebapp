package com.goyal.springboot.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	
	/*
	 * The lambda provides a password encoding function to the User builder,
	 * allowing Spring Security to encode the password consistently during user
	 * creation without hard coding the encoding logic.
	 */
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input); // Lambda Function
		UserDetails userDetails = User.builder()
									.passwordEncoder(passwordEncoder)		
									.username("goyal")
									.password("ChangePwd")
									.roles("USER","ADMIN")
									.build();
		
		// UserDetails → a user record
		// InMemoryUserDetailsManager → a phonebook
		// Here is the user. Store it in memory and return it when someone tries to log in.
		return new InMemoryUserDetailsManager(userDetails); 
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
