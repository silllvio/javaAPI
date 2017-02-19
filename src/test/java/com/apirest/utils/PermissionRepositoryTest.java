package com.apirest.utils;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.apirest.permission.PermissionEntity;
import com.apirest.permission.PermissionRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionRepositoryTest {

	@Autowired
	PermissionRepository permissionResitory;
	
	private static final Logger LOGGER = Logger.getLogger(PermissionRepository.class);
	
	@Test
	public void findAll() {
		
		List<PermissionEntity> permissions = this.permissionResitory.findAll();

		LOGGER.info(permissions);
	}
	
	
}
