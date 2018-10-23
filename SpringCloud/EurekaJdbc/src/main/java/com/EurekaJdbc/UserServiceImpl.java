package com.EurekaJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("IuserService")
public class UserServiceImpl implements IUserService{
	@Autowired//(required = false)
	private UserMapper userMapper;
	@Override
	public User getUserById(Long id) {
		return userMapper.getUserById(id);
	}
	
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
