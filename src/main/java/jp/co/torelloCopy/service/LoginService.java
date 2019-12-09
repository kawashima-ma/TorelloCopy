package jp.co.torelloCopy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.torelloCopy.dto.UserDto;
import jp.co.torelloCopy.dto.factory.UserDtoFactory;
import jp.co.torelloCopy.mapper.UsersMapper;
import jp.co.torelloCopy.utils.CipherUtil;
@Service
public class LoginService {
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private UserDtoFactory userDtoFactory;

	public UserDto login (String name, String password) {
		UserDto user = userDtoFactory.create(usersMapper.getUser(name, CipherUtil.encrypt(password)));
		return user;
	}
}
