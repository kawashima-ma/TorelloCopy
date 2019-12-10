package jp.co.torelloCopy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.torelloCopy.dto.MakeBoardDto;
import jp.co.torelloCopy.dto.UserBoardDto;
import jp.co.torelloCopy.dto.UserDto;
import jp.co.torelloCopy.entity.MakeBoard;

@Service
public class MakeBoardService {
	@Autowired
	private MakeBoard makeBoardEntity;

	public UserBoardDto makeBoard(UserDto loginUser, MakeBoardDto dto){

	}
}
