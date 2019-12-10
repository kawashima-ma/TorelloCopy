package jp.co.torelloCopy.form;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class MakeBoardForm {
	@NotEmpty
	private String name;
	private List<String> members;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMembers() {
		return members;
	}
	public void setMembers(List<String> members) {
		this.members = members;
	}


}
