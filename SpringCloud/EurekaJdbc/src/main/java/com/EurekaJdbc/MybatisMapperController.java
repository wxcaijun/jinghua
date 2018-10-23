package com.EurekaJdbc;

import com.EurekaJdbc.User;
import com.EurekaJdbc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
//@RequestMapping("/test")
public class MybatisMapperController {
	@Autowired//(required = true)
	//@Qualifier("IuserService")
	private IUserService userSerivce;
	
	@GetMapping("/getUser/{id}")
	public User getUserById(@PathVariable Long id) {
		System.out.println("ssssss");
		return this.userSerivce.getUserById(id);
	}	

}
