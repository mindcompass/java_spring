package com.mindcompass.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Shift + ctrl + o : ��ü ����Ʈ

@RestController // 
public class testController {
	@GetMapping("/test")
	public String test() {
		return "<h1>Hello~</h1>";
	}
	
	
}
