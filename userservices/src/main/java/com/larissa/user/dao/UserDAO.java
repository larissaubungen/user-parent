package com.larissa.user.dao;

import com.larissa.user.dto.User;

public interface UserDAO {
	
	void create(User u);
	
	User read(int id);
	
	User findUser(int id);
}
