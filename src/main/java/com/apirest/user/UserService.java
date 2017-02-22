package com.apirest.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.utils.GenericService;
import com.apirest.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.USER_PATH)
public class UserService extends GenericService<UserEntity, Long> {

}
