package com.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	
	public String sayHello() {
		
		System.err.println("Hello All, Hello World....!!!!");
		
		return "Whats up bro...!!";
	}
}
