package web.gc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.gc.domain.Movie;

public class AccessDao {
	private Connection connection=null;
	/*
	 * create table access (
	name varchar(20),
	value int
	);
	*/
	public void ConnectSql(){
		String url="jdbc:mysql://localhost:3306/GC?characterEncoding=utf-8";
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
	
	public int getAccessTime(){
		String selectSql="select * from access where name='times';";
		int times=0;
		try {
			ResultSet set=connection.prepareStatement(selectSql).executeQuery();
			while(set.next()){
				times= set.getInt("value");
				System.out.println("从数据库取出的times是"+times);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return times;
		
	}
	
	public void setAccessTime(int Times){
	
		String addsql="UPDATE access SET value="+Times+" WHERE name='times';";
		if (getAccessTime()==0) {
			addsql="insert into access values('times',"+Times+");";
		}
		try {
			connection.prepareStatement(addsql).executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void setOnline(int count){
		
	
		String addsql="UPDATE access SET value="+count+" WHERE name='online';";
		
		try {
			connection.prepareStatement(addsql).executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int getOnline(){
		String selectSql="select * from access where name='online';";
		int online=0;
		try {
			ResultSet set=connection.prepareStatement(selectSql).executeQuery();
			while(set.next()){
				online= set.getInt("value");
				System.out.println("从数据库取出的online是"+online);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return online;
		
	}
	
	
	
}
