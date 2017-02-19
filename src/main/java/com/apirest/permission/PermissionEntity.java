package com.apirest.permission;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.apirest.utils.BaseEntity;

@Entity
@Table(name = "tb_permission")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class PermissionEntity extends BaseEntity<Long> {

	public PermissionEntity() {
	}

	public PermissionEntity(String role) {
		super();
		this.role = role;
	}

	private static final long serialVersionUID = 1L;
	@Column(name = "role", length = 45, nullable = false, unique = true)
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
