package com.board.www.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.board.www.dto.UserDto;

@Mapper
@Repository
public interface UserRepository {
	int joinUser(UserDto userDto);

	String idCheck(String userId);

}
