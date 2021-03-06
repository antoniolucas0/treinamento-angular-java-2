package com.indracompany.treinamento.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "clientes")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cliente extends GenericEntity<Long>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String nome;
	
	@CPF
	@Column(length = 11)
	private String cpf;
	
	@Email
	private String email;
	
	private boolean ativo;
	
	private String observacoes;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Conta> listConta;

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	
}