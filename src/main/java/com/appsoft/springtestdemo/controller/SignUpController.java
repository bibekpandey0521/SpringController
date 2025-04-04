package com.appsoft.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
		
	 @GetMapping("/signup")
	  public String getSignUp() {
	        return "SignUp"; 
	    }

	    @PostMapping("/signup") 
	    public String postSignUp() {
	        return "SignUp";
	    }
	
}
