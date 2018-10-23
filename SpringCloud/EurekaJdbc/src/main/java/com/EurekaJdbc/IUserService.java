package com.EurekaJdbc;

//import com.springms.cloud.entity.User;
import java.util.List;


public interface IUserService {	
	User getUserById(Long id);
	List<User> findAllUsers();
	int insertUser(User user);
}
