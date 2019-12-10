package jp.co.torelloCopy.dto;

import java.util.List;

public class MakeBoardDto {
	private Integer id;
	private String name;
	private List<String> members;

	public MakeBoardDto(Integer id, String name, List<String> members) {
		super();
		this.id = id;
		this.name = name;
		this.members = members;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
