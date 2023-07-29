package com.board.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.www.dto.UserDto;
import com.board.www.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@RequestMapping(value = "/user")
@Controller
public class UserController {
	
	private final UserService userService;

	// 회원 가입 페이지 이동
	@GetMapping(value = "/join")
	public String join() {
		log.info("join(GET) 메소드 실행");
		return "/user/join";
	}
	
	// ID중복 체크
	@ResponseBody
	@GetMapping(value = "/idCheck")
	public String idCheck(String userId) {
		log.info("idCheck(GET) 메소드 실행");
		String idChecked = userService.idCheck(userId);
		
		String result = "yes";
		
		if (idChecked != null) {
			result = "no";
		}
		return result;
	}
	
	// 회원 등록
	@PostMapping(value = "/join")
	public String join(UserDto userDto, Model model) {
		
		// int 타입으로 반환값을 받음
		int result = userService.joinUser(userDto);
		
		String msg = "회원 가입 완료";
		
		if (result != 1) {
			msg = "회원 가입 실패";
		}
		
		model.addAttribute("msg", msg);
		return "/index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}