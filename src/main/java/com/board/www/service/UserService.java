package com.board.www.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.board.www.dto.UserDto;
import com.board.www.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;

	public int joinUser(UserDto userDto) {
		System.out.println("joinUser service 실행");
		int result = userRepository.joinUser(userDto);
		return result;
	}
	

}
