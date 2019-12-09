package jp.co.torelloCopy.entityfactory;

import org.springframework.stereotype.Component;

import jp.co.torelloCopy.dto.UserDto;
import jp.co.torelloCopy.entity.User;
import jp.co.torelloCopy.utils.CipherUtil;
@Component
public class UserFactory {
	public User createEncrypt(UserDto dto) {
		return new User(
				null,
				dto.getLogin_id(),
				dto.getName(),
				CipherUtil.encrypt(dto.getPassword())
				);
	}
}
