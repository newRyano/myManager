package com.ryan.service;

import java.util.List;

import com.ryan.pojo.User;

public interface UserService {
	/**
	   * 校验用户信息
	 * @param uname
	 * @param pwd
	 * @return 返回 查询到的用户信息
	 */
	User checkUserLoginService(String uname,String pwd);
	/**
	 * 修改用户密码
	 * @param newPwd
	 * @param uid
	 * @return
	 */
	int userChangePwdSercice(String newPwd, int uid);
	/**
	 * 查询所有用户信息
	 * @return
	 */
	List<User> userShowService();
	/**
	 * 用户注册
	 * @param u
	 * @return
	 */
	int userRegService(User u);
}
