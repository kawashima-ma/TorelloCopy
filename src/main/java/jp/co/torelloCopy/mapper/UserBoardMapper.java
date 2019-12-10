package jp.co.torelloCopy.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.torelloCopy.entity.UserBoard;

@Component
public interface UserBoardMapper {
	public List<UserBoard> getBoardIdList(Integer user_id);

}
