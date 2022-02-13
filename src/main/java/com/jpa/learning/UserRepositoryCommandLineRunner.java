package com.jpa.learning;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.learning.entity.User;
import com.jpa.learning.service.UserRepository;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log=
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jill","Admin");
		userRepository.save(user);
		log.info("New user is created: "+user);
		
		Optional<User> findById = userRepository.findById(1L);	
		log.info("New user is retrieved: "+findById);
		
		List<User> findAll = userRepository.findAll();
		log.info("All users: "+findAll);
	}
}
