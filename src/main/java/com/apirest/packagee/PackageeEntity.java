package com.apirest.packagee;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.apirest.user.UserEntity;
import com.apirest.utils.BaseEntity;

@Entity
@Table(name = "tb_package")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class PackageeEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	public PackageeEntity() {

	}

	public PackageeEntity(String name, String code, String description, Date registerDate, UserEntity user) {
		super();
		this.name = name;
		this.code = code;
		this.description = description;
		this.registerDate = registerDate;
		this.user = user;
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

	// @Column(name = "owner_id", length = 11, nullable = true)
	// private Long ownerId;

	@ManyToOne
	@JoinColumn(name = "owner_id") // Informa qual é campo que referencia minha
									// entidade.
	private UserEntity user;

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

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
}
