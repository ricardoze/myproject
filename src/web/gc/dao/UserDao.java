package web.gc.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.gc.domain.User;

public class UserDao {
	
	private Connection connection=null;
	
	public void ConnectSql(){
		String url="jdbc:mysql://localhost:3306/GC";
		String username="root";
		String password="admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addUser(User user){
		String name=user.getUserName();
		String password=user.getPassWord();
		String addsql="insert into userlist(username ,password) values ('"+name+"','"+password+"');";
		try {
			connection.prepareStatement(addsql).executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String selectUser(String username){
		String psw=null;
		String addsql="select * from userlist where username= '"+username+"';";
		try {
			ResultSet set=connection.prepareStatement(addsql).executeQuery();
			while(set.next()){
				 psw=set.getString("password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return psw;
	}
	
}
