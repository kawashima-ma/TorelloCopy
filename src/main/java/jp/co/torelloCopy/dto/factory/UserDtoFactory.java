package jp.co.torelloCopy.dto.factory;

import org.springframework.stereotype.Component;

import jp.co.torelloCopy.dto.UserDto;
import jp.co.torelloCopy.form.SignupForm;


@Component
public class UserDtoFactory {

	public UserDto sign(SignupForm signupForm) {
		return new UserDto(
				null,
				signupForm.getLogin_id(),
				signupForm.getName(),
				signupForm.getPassword()
				);
	}

}
