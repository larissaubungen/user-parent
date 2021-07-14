/**
 * 
 */
package com.larissa.user.dao;

import java.util.HashMap;
import java.util.Map;

import com.larissa.user.dto.User;

/**
 * @author Legion
 *
 */
public class UserDAOImpl implements UserDAO {
	
	Map<Integer, User> users = new HashMap<>();
	private static UserDAO dao = new UserDAOImpl();

	@Override
	public void create(User u) {
		users.put(u.getId(), u);
	}

	@Override
	public User read(int id) {
		return users.get(id);
	}
	
	@Override
	public User findUser(int id) {
		return dao.read(id);
	}

}
