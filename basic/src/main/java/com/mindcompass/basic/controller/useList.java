package com.mindcompass.basic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class useList {
	@GetMapping("userList")
	public String userList(Model model) {
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> user = null;
		user = new HashMap<>();
		user.put("userId", "a");
		user.put("userName", "apple");
		user.put("userAge", 21);
		userList.add(user);
		user = new HashMap<>();
		user.put("userId", "b");
		user.put("userName", "banana");
		user.put("userAge", 22);
		userList.add(user);
		user = new HashMap<>();
		user.put("userId", "c");
		user.put("userName", "carrot");
		user.put("userAge", 23);
		userList.add(user);
		model.addAttribute("userList", userList);
		return "userList";
	}
}
