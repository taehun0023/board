package com.board.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BoardController {

	@GetMapping(value = "/")
	public String main() {
		System.out.println("main (GET) 메소드 실행");
		return "/index";
	}
}
