package com.indracompany.treinamento.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import lombok.Data;
import lombok.EqualsAndHashCode;
import antlr.collections.List;

@Entity
@Table(name = "contas")
@EqualsAndHashCode(callSuper = true)
@Data

public class Conta extends GenericEntity<Long>{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 4, nullable = false)
	private String agencia;
	
	@Column(length = 6, nullable = false)
	private String conta;
	
	private Double saldo;
	
	@OneToMany
	@JoinColumn(name = "fk_cliente_id", nullable = false)
	private Cliente cliente;

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSaldo(double d) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
