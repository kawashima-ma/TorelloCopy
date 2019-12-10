package jp.co.torelloCopy.entity;

public class UserBoard {
	private Integer id;
	private Integer user_id;
	private Integer board_id;
	private String board_name;


	public UserBoard(Integer id, Integer user_id, Integer board_id, String board_name) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.board_id = board_id;
		this.board_name = board_name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getBoard_id() {
		return board_id;
	}
	public void setBoard_id(Integer board_id) {
		this.board_id = board_id;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

}
