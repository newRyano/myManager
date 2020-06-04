package com.ryan.dao;

import java.util.List;

import com.ryan.pojo.User;

public interface UserDao {
	//根据用户名密码查询用户信息
	User checkUserLoginDao(String uname,String pwd);
	//根据用户ID修改密码
	int userChangePwdDao(String newPwd, int uid);
	//查询所有用户信息
	List<User> userShowDao();
	//用户注册
	int userRegDao(User u);
}
