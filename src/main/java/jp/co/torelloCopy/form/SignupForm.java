package jp.co.torelloCopy.form;

import javax.validation.GroupSequence;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class SignupForm {
	public interface Group1 {}
	public interface Group2 {}
	public interface Group3 {}

	@GroupSequence({Group1.class,Group2.class,Group3.class})
	public interface All {}


	@NotEmpty(message = "名前を入力してください",groups = Group1.class)
	@Size(max = 20,message = "名前を、20文字以下で入力して下さい",groups = Group2.class)
	private String name;

	@NotEmpty(message = "パスワードを入力してください",groups = Group1.class)
	@Size(min = 6, max = 20,message = "パスワードを、6~20文字以下で入力して下さい",groups = Group2.class)
	private String password;


	@NotEmpty(message = "確認用パスワードを入力してください")
	private String confirmPassword;





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


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



}
