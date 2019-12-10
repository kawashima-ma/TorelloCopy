package jp.co.torelloCopy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.torelloCopy.dto.UserBoardDto;
import jp.co.torelloCopy.dto.factory.UserBoardDtoFactory;
import jp.co.torelloCopy.mapper.UserBoardMapper;

@Service
public class HomeService {
	@Autowired
	private UserBoardMapper userBoardMapper;
	@Autowired
	private UserBoardDtoFactory userBoardDtoFactory;

	public List<UserBoardDto> getBoardIds(Integer userId){
		List<UserBoardDto> list = new ArrayList<UserBoardDto>();
		list = userBoardDtoFactory.createList(userBoardMapper.getBoardIdList(userId));
		return list;
	}

}
