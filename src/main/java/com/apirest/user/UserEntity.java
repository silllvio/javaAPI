package com.apirest.user;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.apirest.permission.PermissionEntity;
import com.apirest.utils.BaseEntity;

/*
 * Mapeando o nome do atributo chave do objeto java com a o atributo chave da
 * entidade de banco de dados.
 */
@Entity
@Table(name = "tb_user")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class UserEntity extends BaseEntity<Long> {

	/*
	 * O long é para informar que o número da pk da tabela é inteiro.
	 */

	private static final long serialVersionUID = 1L;

	public UserEntity() {

	}

	public UserEntity(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	// Id, não precisamos maperar porque já está na super classe.

	@Column(name = "name", length = 120, nullable = false)
	private String name;

	@Column(name = "email", length = 255, nullable = false, unique = true)
	private String email;

	@Column(name = "password", length = 128, nullable = false)
	private String password;

	/* O EAGER deixa o sistema pesado */
	// @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	// private List<PackageeEntity> packagees;

	/*
	 * A tabela tb_user_permission é nossa tabela intermidiária.
	 */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_user_permission", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
	public List<PermissionEntity> permissions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// public List<PackageeEntity> getPackagees() {
	// return packagees;
	// }
	//
	// public void setPackagees(List<PackageeEntity> packagees) {
	// this.packagees = packagees;
	// }

}

// OBS: O Atribute override só é necessário quando o nome da coluna da tabela
// for diferente do nome do atributo da classe.
// O Table name apenas é necessário quando o nome da tabela for diferente do
// nome da classe.