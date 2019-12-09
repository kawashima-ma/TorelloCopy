package jp.co.torelloCopy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.torelloCopy.dto.UserDto;
import jp.co.torelloCopy.entityfactory.UserFactory;
import jp.co.torelloCopy.mapper.UsersMapper;

@Service
public class SignupService {
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private UserFactory userFactory;

	public void registUser(UserDto dto) {
		usersMapper.regist(userFactory.createEncrypt(dto));
	}
}
