package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.model.User;
@Service
public class UserService{
	@Autowired
	UserMapper userMapper;
	
	public List<User> list(String where){
		return userMapper.list(where);
	}
	public List<User> sealist(String where) {
		// TODO Auto-generated method stub
		return userMapper.sealist(where);
	}

	public int total() {
		return userMapper.total();
	}

	
	public void insert(User c) {
		userMapper.insert(c);
		
	}


	public void update(User c) {
		userMapper.update(c);
	}


	public void delete(User c) {
		userMapper.delete(c.getId());
	}


	public User get(int id) {
		// TODO Auto-generated method stub
		return userMapper.get(id);
	}

   public void updatesql(String value) {
		userMapper.updatesql(value);
	}
	public void deletesql(String value) {
		userMapper.deletesql(value);
	}
}