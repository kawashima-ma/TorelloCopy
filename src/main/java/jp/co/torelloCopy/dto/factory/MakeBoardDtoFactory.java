package jp.co.torelloCopy.dto.factory;



import org.springframework.stereotype.Component;

import jp.co.torelloCopy.dto.MakeBoardDto;
import jp.co.torelloCopy.form.MakeBoardForm;

@Component
public class MakeBoardDtoFactory {
	public MakeBoardDto create(MakeBoardForm form) {

		return new MakeBoardDto(
				null,
				form.getName(),
				form.getMembers()
				);
	}

}
