package com.etc.test;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etc.entity.Users;
import com.etc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml","classpath:mybatis-config.xml"})
public class TestHere {
	@Resource(name="userService")
	private UserService us;
	
	@Test
	public void queryByState() {
//		String user_acc = "admin";
//		String user_pwd = "admin";
//
//		Users users = new Users();
//		users.setUser_acc(user_acc);
//		users.setUser_pwd(user_pwd);
//
//		users = us.login(users);
		
//		System.out.println(users);
		List<Users>list= us.queryUsersByState(0);
		list.forEach(System.out::println);
	}
}
