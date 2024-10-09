package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

	@RequestMapping("/hing")
	public String hing()
	{
		System.out.println("hello");
		return "hing";
	}
}
