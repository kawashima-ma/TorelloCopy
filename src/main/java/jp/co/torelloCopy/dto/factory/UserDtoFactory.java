package jp.co.torelloCopy.dto.factory;

import org.springframework.stereotype.Component;

import jp.co.torelloCopy.dto.UserDto;
import jp.co.torelloCopy.entity.User;
import jp.co.torelloCopy.form.SignupForm;


@Component
public class UserDtoFactory {

	public UserDto sign(SignupForm signupForm) {
		return new UserDto(
				null,
				signupForm.getName(),
				signupForm.getPassword()
				);
	}

	public UserDto create(User user) {
		if(user == null) {
			return null;
		}
		return new UserDto(
				user.getId(),
				user.getName(),
				user.getPassword()
				);
	}

}
