package jp.co.torelloCopy.mapper;

import org.springframework.stereotype.Component;

import jp.co.torelloCopy.entity.User;

@Component
public interface UsersMapper {
	public void regist(User user);
}
