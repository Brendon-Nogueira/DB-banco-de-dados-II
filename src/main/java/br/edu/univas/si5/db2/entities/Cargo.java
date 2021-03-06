package br.edu.univas.si5.db2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Position") public class Cargo {
	 @Id
	 @Column (name="CODE")
	private Integer codigo;
	 
	 @Column (name="NAME")
	private String nome;
	 @Column (name="WAGE")
	private float salario;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoCargo type;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
	public TipoCargo getType() {
		return type;
	}
	public void setType(TipoCargo type) {
		this.type = type;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer i) {
		this.codigo = i;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
