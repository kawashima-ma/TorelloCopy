package jp.co.torelloCopy.dto;

public class UserDto {
	private Integer id;
	private String login_id;
	private String name;
	private String password;


	public UserDto(Integer id, String login_id, String name, String password) {
		super();
		this.id = id;
		this.login_id = login_id;
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
