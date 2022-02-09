package com.jpa.learning;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.learning.entity.User;
import com.jpa.learning.service.UserDAOService;


@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log=
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jack","Admin");
		long insert= userDaoService.insert(user);
		log.info("New user is created: "+user);
	}
	
}
