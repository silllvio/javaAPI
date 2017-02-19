package com.apirest.userpermission;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.apirest.utils.BaseKey;

@Embeddable
public class UserPermissionKey extends BaseKey {

	private static final long serialVersionUID = 1L;

	public UserPermissionKey() {
	}

	public UserPermissionKey(Long permissionId, Long userId) {
		super();
		this.permissionId = permissionId;
		this.userId = userId;
	}

	@Column(name= "permission_id", nullable= false)
	private Long  permissionId;
	
	@Column(name = "user_id", nullable= false)
	private Long userId;

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}

//Os dois atributos dessa entidade relacionam a chave primária.
