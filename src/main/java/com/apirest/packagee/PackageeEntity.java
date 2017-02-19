package com.apirest.packagee;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.apirest.utils.BaseEntity;

@Entity
@Table(name = "tb_package")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class PackageeEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	public PackageeEntity() {

	}

	public PackageeEntity(String name, String code, String description, Date registerDate, Long ownerId) {
		super();
		this.name = name;
		this.code = code;
		this.description = description;
		this.registerDate = registerDate;
		this.ownerId = ownerId;
	}

	@Column(name = "name", length = 60, nullable = false)
	private String name;

	@Column(name = "code", length = 20, nullable = false)
	private String code;

	@Column(name = "description", length = 150, nullable = true)
	private String description;

	@Column(name = "register_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date registerDate;

	@Column(name = "owner_id", length = 11, nullable = true)
	private Long ownerId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

}
