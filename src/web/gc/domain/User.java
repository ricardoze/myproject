package web.gc.domain;

public class User {
	
	/*
	 * create table userlist(
		username varchar(20),
		password varchar(20))ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
	 * */
	private String userName;
	private String passWord;
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
}
