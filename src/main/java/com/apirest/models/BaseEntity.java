package com.apirest.models;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class BaseEntity<ID extends Serializable>  extends AbstractPersistable<ID>{

	private static final long serialVersionUID = 1L;
	
	
//	Com esse método sobrescrito  o toString retornará todas as informações do objeto.
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this,obj);
	}
	
	// Deve ser público para podermos salvar no banco de dados.
	@Override
	public void setId(ID id) {
		super.setId(id);
	} 
	
	
	// Serve para ignorar a palavra new(campo new) que será enviado para o frontEnd.
	@JsonIgnore
	@Override
	public boolean isNew() {
		return super.isNew();
	}
	
}

//
//Objeto responsável por mapear o banco de dados.
//Normalmente temos uma entidade para cada tabela.
//Todas as entidades vão herdar essa classe e especificar qual é sua chave de relacionamento.
