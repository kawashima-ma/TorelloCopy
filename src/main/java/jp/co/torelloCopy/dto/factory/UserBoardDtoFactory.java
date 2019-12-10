package jp.co.torelloCopy.dto.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import jp.co.torelloCopy.dto.UserBoardDto;
import jp.co.torelloCopy.entity.UserBoard;

@Component
public class UserBoardDtoFactory {
	public UserBoardDto create(UserBoard entity) {
		if(entity == null) {
			return null;
		}
		return new UserBoardDto(
				entity.getId(),
				entity.getUser_id(),
				entity.getBoard_id(),
				entity.getBoard_name()
				);
	}

	public List<UserBoardDto> createList(List<UserBoard> entityList){
		List<UserBoardDto> dtoList = new ArrayList<UserBoardDto>();
		if(CollectionUtils.isEmpty(entityList)) {
			return null;
		}
		for(UserBoard entity : entityList) {
			dtoList.add(create(entity));
		}
		return dtoList;
	}
}
