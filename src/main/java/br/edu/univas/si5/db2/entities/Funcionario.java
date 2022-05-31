package br.edu.univas.si5.db2.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Funcionario {
	
	public Funcionario() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="regSeqGen")
	@SequenceGenerator(name="regSeqGen", sequenceName="SEQ_FUNCIONARIO",
	allocationSize=1) //usando sequence
	
	
	private Integer registro;
	private String nome;
	private String sexo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date nascimento;
	public Date getNascimento() {
		return nascimento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.sexo;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Transient
	private int idade;
	
	
	public Integer getRegistro() {
		return registro;
	}
	public void setRegistro(Integer registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
