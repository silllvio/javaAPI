package com.apirest.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.apirest.packagee.PackageeEntity;
import com.apirest.packagee.PackageeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PackageeRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(PackageeRepository.class);
	
	@Autowired
	PackageeRepository packageeRepository;
	
	@Test
	public void findAll() {
		
		List<PackageeEntity> repository = this.packageeRepository.findAll();
		
		LOGGER.info(repository);
		
	}
	
}
