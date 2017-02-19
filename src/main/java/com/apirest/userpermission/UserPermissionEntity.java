package com.apirest.userpermission;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.apirest.utils.BaseEntity;

@Entity
@Table(name= "tb_user_permission")
public class UserPermissionEntity extends BaseEntity<UserPermissionKey>{

	private static final long serialVersionUID = 1L;
	
	
}
