package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/show/emps")
public class HelloController {

	@GetMapping("/sayhello")
	@ResponseBody
	public String sayHello() {
		return "Hello Cherry";
	}
}
