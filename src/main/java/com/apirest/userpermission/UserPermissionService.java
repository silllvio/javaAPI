package com.apirest.userpermission;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.utils.GenericService;
import com.apirest.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.USERPERMISSION_PATH)
public class UserPermissionService extends GenericService<UserPermissionEntity, UserPermissionKey> {

	
	
}
