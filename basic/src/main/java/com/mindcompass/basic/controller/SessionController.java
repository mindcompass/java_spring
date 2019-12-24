package com.mindcompass.basic.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.mindcompass.model.User;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(
			User user, //@ModelAttribute("user") User user 
			HttpSession session) { //무조건 실행함
		session.setAttribute("user", user); 
		return "redirect:/main"; // 이쪽으로 강제로 보내라
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}