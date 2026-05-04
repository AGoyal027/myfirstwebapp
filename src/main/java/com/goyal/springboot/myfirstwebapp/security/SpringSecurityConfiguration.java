package com.goyal.springboot.myfirstwebapp.security;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer.FrameOptionsConfig;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.sun.net.httpserver.Headers;

@Configuration
public class SpringSecurityConfiguration {
	
	/*
	 * The lambda provides a password encoding function to the User builder,
	 * allowing Spring Security to encode the password consistently during user
	 * creation without hard coding the encoding logic.
	 */
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		UserDetails userDetails1 = createNewUser("goyal", "ChangePwd");
		UserDetails userDetails2 = createNewUser("tcs", "dummy");
		
		return new InMemoryUserDetailsManager(userDetails1, userDetails2); 
	}

	private UserDetails createNewUser(String username, String password) {
		
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input); // Lambda Function
		
		UserDetails userDetails = User.builder()
									.passwordEncoder(passwordEncoder)		
									.username(username)
									.password(password)
									.roles("USER","ADMIN")
									.build();
		
		// UserDetails → a user record
		// InMemoryUserDetailsManager → a phonebook
		// Here is the user. Store it in memory and return it when someone tries to log in.
		
		return userDetails;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated());
		http.formLogin(withDefaults());
		
		http.csrf(csrf -> csrf.disable());
		http.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));
		
		return http.build();
	}

}
