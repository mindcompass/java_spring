package com.mindcompass.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j // 컴파일러가 보기 위한 주석  어노테이션
@Controller
public class HomeController {
	// 1. 출력 속도가 빠르다
	//2. 파일 등을 이요하여 관리가 용이함
	Logger logger = 
			LoggerFactory.getLogger(this.getClass());
	//shif alt a 열편지
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!"); // 개발단계에서 확인용
		log.info("info!");  // 운용 상 필요한 
		log.info("warning!"); // 메모리 문제 
		log.info("error!"); //치명적인 오류
		log.info("error!"); //치명적인 오류
		
		return "home";
	}
}