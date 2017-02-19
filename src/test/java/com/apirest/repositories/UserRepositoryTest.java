package com.apirest.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.apirest.user.UserEntity;
import com.apirest.user.UserRepository;
import com.apirest.utils.AbstractTest;

public class UserRepositoryTest extends AbstractTest {

	
	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testFindAll() {
		
		List<UserEntity> users = this.userRepository.findAll();
		
		LOGGER.info(users);
		
	}
	
	@Test
	public void findByEmail() {
		
		UserEntity user = this.userRepository.findByEmail("admin@admin.com");
		
		LOGGER.info(user);
		
	}
	
	@Test
	public void findByEmailOrName(){
		
		List<UserEntity> userFindedByEmailOrName = this.userRepository.findByEmailOrName("cade@.com", "admin");
		
		LOGGER.info(userFindedByEmailOrName);
		
	}
	
}
