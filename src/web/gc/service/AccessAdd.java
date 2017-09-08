package web.gc.service;

import java.util.HashSet;

import web.gc.dao.AccessDao;


public class AccessAdd {
	private AccessDao accessDao;
	
	public AccessAdd() {
		accessDao=new AccessDao();
		accessDao.ConnectSql();
	}
	public void setTimes(int Times) {
		accessDao.setAccessTime(Times);
	}
	
	public int getTime(){
		return accessDao.getAccessTime();
	}
	
	
	public void addOnline(int count) {
		count++;
		accessDao.setOnline(count);
	}
	public void desOnline(int count) {
		count--;
		accessDao.setOnline(count);
	}
	
	public int getOnline(){
		return accessDao.getOnline();
	}
}
