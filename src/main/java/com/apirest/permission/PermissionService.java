package com.apirest.permission;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.utils.GenericService;
import com.apirest.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PERMISSIONS_PATH)
public class PermissionService extends GenericService<PermissionEntity, Long> {

	
	
}
