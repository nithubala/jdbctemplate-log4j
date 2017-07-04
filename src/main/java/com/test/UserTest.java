package com.test;

import com.dao.UserDao;
import com.model.UserModel;

public class UserTest {
public static void main(String[] args) {
		
		UserModel user = new UserModel();
		user.setId(1);
		user.setName("nithya");
		user.setUsername("nithyabala");
		user.setPassword("rose");
		user.setMobileno(967702484);
		user.setEmailid("nithu@gmail.com");
		user.setActive("yes");
		user.setRole("user");
		
		UserDao userDAO = new UserDao();
		
		
		try {
			userDAO.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			userDAO.loginUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			userDAO.updatePassword(user, "chocci");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

