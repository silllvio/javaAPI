package com.apirest.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.apirest.userpermission.UserPermissionEntity;
import com.apirest.userpermission.UserPermissionRepository;
import com.apirest.utils.AbstractTest;

public class UserPermissionRepositoryTest extends AbstractTest {

	@Autowired
	UserPermissionRepository userPermissionRepository;
		private static final Logger LOGGER = Logger.getLogger(UserPermissionRepository.class);
		
		@Test 
		public void findAllTest(){
			
			List<UserPermissionEntity> permissions = this.userPermissionRepository.findAll();
			
			LOGGER.info(permissions);
			
		}
	
	
	
}
