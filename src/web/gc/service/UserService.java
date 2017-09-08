package web.gc.service;

import web.gc.dao.UserDao;
import web.gc.domain.User;

public class UserService {
	private UserDao userDao;
	
	public UserService() {
		userDao=new UserDao();
		userDao.ConnectSql();
	}
	
	
	public boolean login(User user){
		if (check(user)) {
			return true;
		}else{
			return false;
		}
		
	}
	public boolean signup(User user){
		if (userDao.selectUser(user.getUserName())==null) {
			userDao.addUser(user);
			return true;
		}
		return false;
		
	}
	
	public boolean check(User user){
		if (user.getPassWord().equals(
				userDao.selectUser(
						user.getUserName()))) {
			return true;
		}
		return false;
		
	}
	
}
