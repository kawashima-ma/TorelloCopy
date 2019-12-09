package jp.co.torelloCopy.form;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {
	@NotEmpty(message = "ログインIDを入力してください")
	private String name;
	@NotEmpty(message = "パスワードを入力してください")
	private String password;



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
