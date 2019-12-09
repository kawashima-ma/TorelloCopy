package jp.co.torelloCopy.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import jp.co.torelloCopy.entity.User;

@Component
public interface UsersMapper {
	public void regist(User user);

	public User getUser(@Param("name") String name, @Param("password") String password);
}
