package com.EurekaJdbc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = EurekaJdbc.class)
@SpringBootTest(classes = EurekaJdbc.class)
public class ApplicationTests {
	@Autowired
	private UserMapper userMapper;
 
	@Test
	@Rollback
	public void findByName() throws Exception {
		userMapper.insert(2,"AAA", 20);
		User u = userMapper.findByName("AAA");
		Assert.assertEquals(20, u.getAge().intValue());
		}

}
